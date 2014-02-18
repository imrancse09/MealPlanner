package net.therap.controller;

import net.therap.model.User;
import net.therap.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Inject
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String firstPage() {
        return "login";
    }

    @RequestMapping(value = "/userPage", method = RequestMethod.POST)
    public String loginSuccess(@RequestParam("txtName") String name,
                               @RequestParam("txtEmail") String email,
                               HttpServletRequest httpServletRequest,
                               HttpSession httpSession,
                               ModelMap modelMap) {

        User user = userService.checkLogin(name, email);

        if (user != null) {
            if (user.getAdmin() == 1) {
                httpSession = httpServletRequest.getSession(true);
                if(httpServletRequest.getSession(false) != null) {
                    httpServletRequest.getSession().setAttribute("user", user);
                    return "adminPage";
                }
            } else {
                httpSession = httpServletRequest.getSession(true);
                if(httpServletRequest.getSession(false) != null) {
                    httpServletRequest.getSession().setAttribute("user", user);
                    return "redirect:viewHomePage";
                }
            }
        }
        return "login";
    }
}