package net.therap.controller;

import net.therap.model.FoodItem;
import net.therap.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/11/14
 * Time: 9:18 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class ListController {
    @Autowired
    private FoodItemService foodItemService;

    @RequestMapping(value = "/redirectedAddMealPage", method = RequestMethod.POST)
    public String foodList(ModelMap modelMap) {
        List<FoodItem> foodItemList = foodItemService.retrieveFoodItemList();
        modelMap.addAttribute("foodItemList", foodItemList);
        return "addMeal";
    }
}
