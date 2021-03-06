package ge.economy.involve.core.services;

import ge.economy.involve.core.api.dto.GenderDTO;
import ge.economy.involve.core.api.dto.TokenDTO;
import ge.economy.involve.core.api.dto.UserDTO;
import ge.economy.involve.core.api.dto.UserTypeDTO;
import ge.economy.involve.core.api.request.AddUserRequest;
import ge.economy.involve.core.dao.UserDAO;
import ge.economy.involve.core.execptions.IncorectUserCredentialsException;
import ge.economy.involve.core.execptions.MailAlreadyUsedException;
import ge.economy.involve.core.execptions.UserNotFoundWithKeyException;
import ge.economy.involve.database.database.Tables;
import ge.economy.involve.database.database.tables.UserRegister;
import ge.economy.involve.database.database.tables.records.TokenRecord;
import ge.economy.involve.database.database.tables.records.UserRegisterRecord;
import ge.economy.involve.database.database.tables.records.UsersRecord;
import ge.economy.involve.utils.DateTimeUtils;
import ge.economy.involve.utils.MD5Provider;
import ge.economy.involve.utils.email.EmailNotSentException;
import ge.economy.involve.utils.email.SendEmailWithAttachment;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by nino on 7/10/16.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private DSLContext dslContext;


    public void registrationUser(AddUserRequest request) throws EmailNotSentException, MailAlreadyUsedException {
        UsersRecord oldUser = userDAO.getUserByMail(request.getEmail());
        if (oldUser != null) {
            throw new MailAlreadyUsedException();
        }
        request.setApproved(false);
        request.setGroupId(UserDTO.USER_GROUP_USER);
        request.setStatusId(UserDTO.USER_STATUS_ACTIVE);
        UserDTO user = saveUser(request);
        UserRegisterRecord record = dslContext.newRecord(Tables.USER_REGISTER);
        record.setEmail(user.getEmail());
        record.setUserId(user.getId());
        record.setKey(UUID.randomUUID().toString());
        record.setIsExpired(false);
        record.store();
        SendEmailWithAttachment mailSender = new SendEmailWithAttachment();
        mailSender.setTo(user.getEmail());
        mailSender.setBody("                         <p>მოგესალმებით <b>" + user.getName() + "</b></p>\n" +
                "                                    <p>ეს არის აქტივაციის ლინკი თქვენი მომხმარებლისთვის საიტზე chaerte.ge \n" +
                "                                    <p></p>\n" +
                "                                    <p>თქვენი ანგარიში არის: <b>" + user.getEmail() + "</b></p>\n" +
                "                                    <p></p>\n" +
                "                                    <p>აქტივაციის ლინკი:</p>\n" +
                "                                    <p></p>\n" +
                "                                    <p>http://chaerte.ge/activate.php?activateId=" + record.getKey() + "</p>\n" +
                "                                    <p></p>\n" +
                "                                    <p>იმედი გვაქვს რომ მალე გიხილავთ!</p>\n" +
                "                                    <br/>\n" +
                "                                    <p>მადლობა,</p>\n" +
                "                                    <p>ეკონომიკის და მდგრადი განვითარების სამინისტრო</p>\n");
        mailSender.send();
    }

    public void activateUser(String key) throws UserNotFoundWithKeyException {
        UserRegisterRecord user = userDAO.getUserRegistrationByKey(key);
        if (user != null) {
            userDAO.updateUserActivation(user.getUserId());
            userDAO.updateUserRegistration(user.getId());
        } else {
            throw new UserNotFoundWithKeyException("აქტივაციის კოდი უკვე არ არსებობს, თავიდან გაიარეთ რეგისტრაცია");
        }
    }

    public UserDTO saveUser(AddUserRequest request) {
        boolean newRecord = false;
        UsersRecord record = null;
        if (request.getId() != null) {
            record = userDAO.getUserObjectById(request.getId());
        }

        if (record == null) {
            record = dslContext.newRecord(Tables.USERS);
            newRecord = true;
        }

        record.setUserTypeId(request.getTypeId());
        if (request.getTypeId() == UserDTO.USER_PHISICAL) {
            record.setFirstName(request.getFirstName());
            record.setLastName(request.getLastName());
            record.setGenderId(request.getGenderId());
        } else {
            record.setOrgName(request.getOrgName());
        }
        record.setIdNumber(request.getIdNumber());
        record.setPhone(request.getPhone());
        record.setEmail(request.getEmail());
        record.setUserTypeId(request.getTypeId());
        record.setUserGroupId(request.getGroupId());
        record.setStatusId(request.getStatusId());
        if (request.getPassword() != null) {
            record.setPassword(MD5Provider.doubleMd5(request.getPassword()));
        }
        if (request.getGroupId() == UserDTO.USER_GROUP_ADMIN) {
            record.setIsApproved(true);
        }


        if (newRecord) {
            record.store();
        } else {
            record.update();
        }
        return UserDTO.translate(record);
    }

    public List<UserDTO> getUsers() {
        return UserDTO.translateArray(userDAO.getUsers());
    }

    public UserDTO getUserById(int id) {
        return UserDTO.translate(userDAO.getUserById(id));
    }

    public UserDTO getUser(String username, String password) {

        Record record = userDAO.getUser(username, MD5Provider.doubleMd5(password));

        if (record == null) {
            return null;
        }
        return UserDTO.translate(record);
    }

    public UserDTO signIn(String username, String password) throws IncorectUserCredentialsException {

        Record record = userDAO.getUser(username, MD5Provider.doubleMd5(password));
        UserDTO user = null;
        if (record != null) {
            user = UserDTO.translate(record);
            TokenRecord token = userDAO.getToken(user.getId());
            if (token != null) {
                userDAO.deleteToken(token.getId());
            }
            TokenRecord newToken = userDAO.generateToken(user.getId(), UUID.randomUUID().toString(), new Date(), DateTimeUtils.addDays(new Date(), UserDTO.TOKEN_VALID_DAY_NUMBER));
            user.setToken(newToken.getKey());
        } else {
            throw new IncorectUserCredentialsException("ამ მონაცემებით აქტიური მომხმარებელი არ იძებნება");
        }
        return user;
    }

    public List<UserTypeDTO> getUserTypes() {
        return UserTypeDTO.translateArray(userDAO.getUserTypes());
    }

    public List<UserTypeDTO> getUserGroups() {
        return UserTypeDTO.translateArray(userDAO.getUserGroups());
    }

    public List<UserTypeDTO> getUserStatuses() {
        return UserTypeDTO.translateArray(userDAO.getUserStatus());
    }

    public List<GenderDTO> getGenders() {
        return GenderDTO.translateArray(userDAO.getGenders());
    }

    public void deleteUser(int itemId) {
        userDAO.deleteUser(itemId);
    }

    public void updateUserPassword(int userId, String password) {
        userDAO.updateUserPassword(MD5Provider.doubleMd5(password), userId);
    }
}
