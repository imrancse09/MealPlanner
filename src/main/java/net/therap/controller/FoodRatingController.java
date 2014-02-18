package net.therap.controller;

import net.therap.service.FoodItemService;
import net.therap.service.MealDescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/16/14
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodRatingController {
    @Inject
    private MealDescriptionService mealDescriptionService;

    @Inject
    private FoodItemService foodItemService;

    @RequestMapping(value = "/countLikeDislike", method = RequestMethod.POST)
    public String likeCount(HttpServletRequest request, ModelMap modelMap) {
        int returnedMealDescId = Integer.parseInt(request.getParameter("likeButton3"));


        String likeButton = request.getParameter("like");
        String dislikeButton = request.getParameter("dislike");

        if(dislikeButton != null) {
            System.out.println("dislike pressed");
            mealDescriptionService.incrementDisike(returnedMealDescId);
        } else if (likeButton != null) {
            System.out.println("like pressed");
            mealDescriptionService.incrementLike(returnedMealDescId);
        }

        System.out.println("mealDescIdLike: " +returnedMealDescId);

        return "redirect:viewHomePage";
    }
}
