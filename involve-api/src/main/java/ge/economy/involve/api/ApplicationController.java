package ge.economy.involve.api;

import ge.economy.involve.core.api.dto.UserDTO;
import ge.economy.involve.core.api.request.AddInitiateRequest;
import ge.economy.involve.core.api.request.AddUserRequest;
import ge.economy.involve.core.api.request.eventsubscription.SubscribeEventRequest;
import ge.economy.involve.core.execptions.MailAlreadyUsedException;
import ge.economy.involve.core.execptions.UserNotFoundWithKeyException;
import ge.economy.involve.core.response.Response;
import ge.economy.involve.core.services.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import ge.economy.involve.utils.email.EmailNotSentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/app"})
public class ApplicationController {
    @Autowired
    private UserService userService;
    @Autowired
    private ReformService reformService;

    @Autowired
    private InitiateService initiateService;


    @Autowired
    private FileService fileService;

    @ResponseBody
    @RequestMapping({"/get-version"})
    public Response getVersion() {
        return Response.withData("v0.0.1");
    }


    @ResponseBody
    @RequestMapping({"/save-initiate"})
    public Response saveInitiate(@RequestParam int sphereId, @RequestParam String description) {
        AddInitiateRequest request = new AddInitiateRequest();
        request.setUserId(1);
        request.setSphereId(sphereId);
        request.setDescription(description);
        return Response.withData(initiateService.saveInitiate(request));
    }

    @ResponseBody
    @RequestMapping({"/get-sportsmans"})
    public Response getSportsmans(@RequestParam("sportTypeId") int sportTypeId, @RequestParam("genderId") int genderId, @RequestParam("regionId") int regionId,
                                  @RequestParam("cityId") int cityId, @RequestParam(required = false) String name, @RequestParam(required = false) String firstLetter,
                                  @RequestParam("start") int start, @RequestParam("limit") int limit) {
        return Response.withData(reformService.searchSportsmans(name, firstLetter, sportTypeId, genderId, regionId, cityId, start, limit));
    }


    @ResponseBody
    @RequestMapping({"/get-reform-by-id"})
    public Response getReformById(@RequestParam("reformId") int reformId) {
        return Response.withData(reformService.getReformById(reformId));
    }


    @RequestMapping({"/get-file"})
    @ResponseBody
    public void getFile(HttpServletResponse response, @RequestParam String identifier)
            throws IOException {
        response.getOutputStream().write(fileService.readFile(identifier.split("\\.")[0]));
    }

    @ResponseBody
    @RequestMapping({"/registration"})
    public Response registration(@RequestParam Integer userTypeId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer genderId, @RequestParam String orgName,
                                 @RequestParam String idNumber, @RequestParam String phone, @RequestParam String email, @RequestParam String password) {
        AddUserRequest request = new AddUserRequest();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setTypeId(userTypeId);
        request.setGenderId(genderId);
        request.setOrgName(orgName);
        request.setIdNumber(idNumber);
        request.setPhone(phone);
        request.setEmail(email);
        request.setPassword(password);
        try {
            userService.registrationUser(request);
        } catch (EmailNotSentException ex) {
            return Response.withError("ემაილის გაგზავნა მითითებულ მაილზე არ სრულდება, გთხოვთ სწორად შეიყვანოთ მაილი");
        } catch (MailAlreadyUsedException e) {
            return Response.withError(e.getMessage());
        }
        return Response.ok();
    }

    @ResponseBody
    @RequestMapping({"/activate-user"})
    public Response activateUser(@RequestParam String key) {
        try {
            userService.activateUser(key);
            return Response.ok();
        } catch (UserNotFoundWithKeyException e) {
            return Response.withError(e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping({"/subscribe-event"})
    public Response subscribeEvent(@RequestParam String email, @RequestParam String sportTypes) {
        SubscribeEventRequest subscribeEventRequest = new SubscribeEventRequest();
        subscribeEventRequest.setEmail(email);
        List<Integer> sportTypeList = new ArrayList();
        String[] stringArray = sportTypes.split(",");
        for (String s : stringArray) {
            sportTypeList.add(Integer.valueOf(Integer.parseInt(s)));
        }
        subscribeEventRequest.setSportTypes(sportTypeList);
        //this.eventSubscriptionService.subscribeEvent(subscribeEventRequest);
        return Response.ok();
    }


}
