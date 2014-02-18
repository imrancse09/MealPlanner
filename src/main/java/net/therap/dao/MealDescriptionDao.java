package net.therap.dao;

import net.therap.model.MealDescription;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/12/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MealDescriptionDao {
    public void insertMealDescription(MealDescription mealDescription);

    public List<MealDescription> retrieveMealDescriptionList();

    public void incrementLike(int mealDescriptionId);

    public void incrementDisike(int mealDescriptionIdFromDislike);
}
