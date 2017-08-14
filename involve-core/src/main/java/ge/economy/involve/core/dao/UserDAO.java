package ge.economy.involve.core.dao;

import ge.economy.involve.database.database.Tables;
import ge.economy.involve.database.database.tables.records.UserRegisterRecord;
import ge.economy.involve.database.database.tables.records.UsersRecord;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nino on 7/10/16.
 */

@Repository
public class UserDAO extends AbstractDAO {

    public List<Record> getUsers() {
        return dslContext.
                select().
                from(Tables.USERS).
                join(Tables.USER_GROUP).on(Tables.USERS.USER_GROUP_ID.eq(Tables.USER_GROUP.ID)).
                join(Tables.USER_TYPE).on(Tables.USERS.USER_TYPE_ID.eq(Tables.USER_TYPE.ID)).
                join(Tables.USER_STATUS).on(Tables.USERS.STATUS_ID.eq(Tables.USER_STATUS.ID)).
                leftJoin(Tables.GENDER).on(Tables.USERS.GENDER_ID.eq(Tables.GENDER.ID)).
                fetch();
    }

    public UsersRecord getUserObjectById(int id) {
        return dslContext.fetchOne(Tables.USERS, Tables.USERS.ID.eq(id));
    }


    public List<Record> getUserGroups() {
        return dslContext.
                select().
                from(Tables.USER_GROUP).
                fetch();
    }

    public List<Record> getUserTypes() {
        return dslContext.
                select().
                from(Tables.USER_TYPE).
                fetch();
    }

    public List<Record> getUserStatus() {
        return dslContext.
                select().
                from(Tables.USER_STATUS).
                fetch();
    }

    public List<Record> getGenders() {
        return dslContext.
                select().
                from(Tables.GENDER).
                fetch();
    }

    public List<UsersRecord> search(String userName) {

        SelectConditionStep<Record> selectConditionStep =
                dslContext.
                        select().
                        from(Tables.USERS).where(Tables.USERS.ID.eq(Tables.USERS.ID));

        if (userName != null) {
            selectConditionStep.and(Tables.USERS.EMAIL.eq(userName));
        }
        return selectConditionStep.fetch().into(UsersRecord.class);
    }

    public Record getUser(String username, String password) {

        return dslContext
                .select()
                .from(Tables.USERS)
                .join(Tables.USER_GROUP).on(Tables.USERS.USER_GROUP_ID.eq(Tables.USER_GROUP.ID))
                .join(Tables.USER_TYPE).on(Tables.USERS.USER_TYPE_ID.eq(Tables.USER_TYPE.ID))
                .join(Tables.USER_STATUS).on(Tables.USERS.STATUS_ID.eq(Tables.USER_STATUS.ID))
                .leftJoin(Tables.GENDER).on(Tables.USERS.GENDER_ID.eq(Tables.GENDER.ID))
                .where(Tables.USERS.EMAIL.eq(username))
                .and(Tables.USERS.PASSWORD.eq(password))
                .and(Tables.USERS.IS_APPROVED.eq(true))
                .fetchAny();

    }

    public void deleteUser(int itemId) {
        dslContext.deleteFrom(Tables.USERS).where(Tables.USERS.ID.eq(itemId)).execute();
    }

    public UserRegisterRecord getUserRegistrationByKey(String key) {
        return dslContext.
                select().
                from(Tables.USER_REGISTER).
                where(Tables.USER_REGISTER.KEY.eq(key)).and(Tables.USER_REGISTER.IS_EXPIRED.eq(false)).
                fetchAny().into(Tables.USER_REGISTER);
    }

    public UsersRecord getUserByMail(String mail) {
        return dslContext.
                select().
                from(Tables.USERS).
                where(Tables.USERS.EMAIL.eq(mail)).
                fetchAny().into(Tables.USERS);
    }

    public void updateUserRegistration(int id) {
        dslContext.update(Tables.USER_REGISTER).set(Tables.USER_REGISTER.IS_EXPIRED, true).where(Tables.USER_REGISTER.ID.eq(id)).execute();
    }

    public void updateUserActivation(int userId) {
        dslContext.update(Tables.USERS).set(Tables.USERS.IS_APPROVED, true).where(Tables.USERS.ID.eq(userId)).execute();
    }
}
