package net.therap.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/5/14
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "User", uniqueConstraints = {
        @UniqueConstraint(columnNames = "userID"),
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "userEmail")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private int userID;

    @Column(name = "name")
    private String name;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userCreationDate")
    private String userCreationDate;

    @Column(name = "isAdmin")
    private int isAdmin;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FoodItem> foodItemList;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userId) {
        userID = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(String userCreationDate) {
        this.userCreationDate = userCreationDate;
    }

    public int getAdmin() {
        return isAdmin;
    }

    public void setAdmin(int admin) {
        isAdmin = admin;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }
}
