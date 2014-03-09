package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/10/14
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AllPageRedirectionController {
    @RequestMapping(value = "/redirectedUserPage", method = RequestMethod.POST)
    public String redirect() {
        return "addFoodItem";
    }

//    @RequestMapping(value = "/redirectedAddItemPage", method = RequestMethod.POST)
//    public String redirectToAddItem() {
//        return "addFoodItem";
//    }

    @RequestMapping(value = "/toAdminPage", method = RequestMethod.GET)
    public String redirectToAdminFromFoodItem() {
        return "adminPage";
    }

    @RequestMapping(value = "/fromRatingToHome", method = RequestMethod.POST)
    public String redirectToAnotherController() {
        return "redirect:viewHomePage";
    }
}


