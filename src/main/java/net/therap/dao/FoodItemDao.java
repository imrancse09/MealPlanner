package net.therap.dao;

import net.therap.model.FoodItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FoodItemDao {
    public void insertFoodItem(FoodItem foodItem);

    public List<FoodItem> retrieveFoodItemList();

    public FoodItem getFoodItemByName(String foodItemName);
}
