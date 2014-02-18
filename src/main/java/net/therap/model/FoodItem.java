package net.therap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/5/14
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "FoodItem")
public class FoodItem {
    @Id
    @Column(name = "foodItemId")
    private int foodItemId;

    @Column(name = "foodItemName")
    private String foodItemName;

    @Column(name = "foodItemCreationDate")
    private String foodItemCreationDate;

    @OneToMany(mappedBy = "foodItem", cascade = CascadeType.ALL)
    private List<MealDescription> mealDescriptionList = new ArrayList<MealDescription>();

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public FoodItem(int itemId, String name, String date, User user) {
        foodItemId = itemId;
        foodItemName = name;
        foodItemCreationDate = date;
        this.setUser(user);
    }

    public FoodItem() {
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(int foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public String getFoodItemCreationDate() {
        return foodItemCreationDate;
    }

    public void setFoodItemCreationDate(String foodItemCreationDate) {
        this.foodItemCreationDate = foodItemCreationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<MealDescription> getMealDescriptionList() {
        return mealDescriptionList;
    }

    public void setMealDescriptionList(List<MealDescription> mealDescriptionList) {
        this.mealDescriptionList = mealDescriptionList;
    }
}
