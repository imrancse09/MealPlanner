package net.therap.validator;

import net.therap.model.FoodItem;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/19/14
 * Time: 1:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class FoodItemValidator implements Validator {
    @Override
    public boolean supports(Class clazz) {
        return FoodItem.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {


        ValidationUtils.rejectIfEmpty(errors, "foodItemName", "foodItem.foodItemName.empty");
        ValidationUtils.rejectIfEmpty(errors, "foodItemCreationDate", "foodItem.foodItemCreationDate.empty");
        System.out.println();


    }
}
