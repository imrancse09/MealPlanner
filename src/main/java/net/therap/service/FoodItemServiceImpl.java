package net.therap.service;

import net.therap.dao.FoodItemDao;
import net.therap.model.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/10/14
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class FoodItemServiceImpl implements FoodItemService {
    @Autowired
    private FoodItemDao foodItemDao;

    @Override
    @Transactional
    public void insertFoodItem(FoodItem foodItem) {
        foodItemDao.insertFoodItem(foodItem);
    }

    @Override
    @Transactional
    public List<FoodItem> retrieveFoodItemList() {
        return foodItemDao.retrieveFoodItemList();
    }

    @Override
    @Transactional
    public FoodItem getFoodItemByName(String foodItemName) {
        return foodItemDao.getFoodItemByName(foodItemName);
    }
}
