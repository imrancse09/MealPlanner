package net.therap.controller;

import net.therap.model.FoodItem;
import net.therap.model.User;
import net.therap.service.FoodItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/10/14
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodItemAdditionController {
    @Inject
    private FoodItemService foodItemService;

    @RequestMapping(value = "/addItem", method = RequestMethod.GET)
    public String itemAdd(@RequestParam("id") int itemId, @RequestParam("name") String name, @RequestParam("date") String date, HttpServletRequest httpServletRequest, ModelMap modelMap) {
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        FoodItem foodItem = new FoodItem(itemId, name, date, user);
        foodItemService.insertFoodItem(foodItem);
        return "success";
    }
}
