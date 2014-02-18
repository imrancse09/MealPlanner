package net.therap.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/5/14
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "MealDescription")
public class MealDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mealDescriptionId")
    private int mealDescriptionId;

    @Column(name = "foodItemName")
    private String foodItemName;

    @Column(name = "mealId")
    private int mealId;

    @Column(name = "mealName")
    private String mealName;

    @Column(name = "mealDescriptionCreationDate")
    private String mealDescriptionCreationDate;

    @Column(name = "likes", nullable = false, columnDefinition = "int default 0")
    private int likes = 0;

    @Column(name = "disLikes", nullable = false, columnDefinition = "int default 0")
    private int disLikes = 0;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="foodItemId")
    private FoodItem foodItem;

    public MealDescription() {
    }

    public int getMealDescriptionId() {
        return mealDescriptionId;
    }

    public void setMealDescriptionId(int mealDescriptionId) {
        this.mealDescriptionId = mealDescriptionId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDescriptionCreationDate() {
        return mealDescriptionCreationDate;
    }

    public void setMealDescriptionCreationDate(String mealDescCreationDate) {
        this.mealDescriptionCreationDate = mealDescCreationDate;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDisLikes() {
        return disLikes;
    }

    public void setDisLikes(int disLikes) {
        this.disLikes = disLikes;
    }
}
