package net.therap.service;

import net.therap.model.FoodItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public interface FoodItemService {
    public void insertFoodItem(FoodItem foodItem);

    public List<FoodItem> retrieveFoodItemList();

    public FoodItem getFoodItemByName(String foodItemName);
}
