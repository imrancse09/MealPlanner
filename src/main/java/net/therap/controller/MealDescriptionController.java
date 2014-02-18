package net.therap.controller;

import net.therap.model.FoodItem;
import net.therap.model.MealDescription;
import net.therap.service.FoodItemService;
import net.therap.service.MealDescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MealDescriptionController {
    @Inject
    private MealDescriptionService mealDescriptionService;

    @Inject
    private FoodItemService foodItemService;

    @RequestMapping(value = "/addMealDesc", method = RequestMethod.POST)
    public String addMealDescription(@RequestParam("select") String mealName,
                                     @RequestParam("foodList") String[] foodItem,
                                     @RequestParam("date") String mealCreationDate) {
        final String Breakfast = "Breakfast";
        final String Lunch = "Lunch";
        final String EveningSnacks = "Evening Snacks";

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Breakfast", 0);
        map.put("Lunch", 1);
        map.put("Evening Snacks", 2);

        if( mealName.equals("Breakfast") || mealName.equals("Lunch") || mealName.equals("Evening Snacks") ) {
            for (int counter = 0; counter<foodItem.length; counter++) {
                String itemName = foodItem[counter];
                FoodItem foodItemByName = foodItemService.getFoodItemByName(itemName);

                MealDescription mealDescription = new MealDescription();

                mealDescription.setFoodItemName(itemName);
                mealDescription.setMealDescriptionCreationDate(mealCreationDate);
                mealDescription.setMealId(map.get(mealName));
                mealDescription.setMealName(mealName);
                mealDescription.setFoodItem(foodItemByName);

                mealDescriptionService.insertMealDescription(mealDescription);
            }
        }
        return "successfullyAddedMeal";
        }
    }

