package net.therap.service;

import net.therap.model.MealDescription;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/12/14
 * Time: 12:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MealDescriptionService {
    public void insertMealDescription(MealDescription mealDescription);

    public List<MealDescription> retrieveMealDescriptionList();

    public void incrementLike(int mealDescriptionId);

    public void incrementDisike(int mealDescriptionIdFromDislike);
}
