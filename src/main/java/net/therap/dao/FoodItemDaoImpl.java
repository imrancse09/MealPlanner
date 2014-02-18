package net.therap.dao;

import net.therap.model.FoodItem;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/10/14
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class FoodItemDaoImpl implements FoodItemDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertFoodItem(FoodItem foodItem) {
        entityManager.merge(foodItem);
    }

    @Override
    public List<FoodItem> retrieveFoodItemList() {
        TypedQuery<FoodItem> query = entityManager.createQuery("SELECT f FROM FoodItem f", FoodItem.class);
        return query.getResultList();
    }

    @Override
    public FoodItem getFoodItemByName(String foodItemName) {
        TypedQuery<FoodItem> query = entityManager.createQuery("SELECT fx FROM FoodItem fx WHERE :foodItemName IN  fx.foodItemName", FoodItem.class);
        query.setParameter("foodItemName", foodItemName);

        List<FoodItem> foodItemList = query.getResultList();
        return foodItemList.isEmpty()? null : foodItemList.get(0);
    }
}
