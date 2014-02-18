package net.therap.controller;

import net.therap.model.MealDescription;
import net.therap.service.MealDescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/13/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller

public class HomePageController  {
    @Inject
    private MealDescriptionService mealDescriptionService;

    @RequestMapping(value = "/viewHomePage", method = RequestMethod.GET)
    public String homePageView(ModelMap modelMap) {
        List<MealDescription> mealDescriptionList = mealDescriptionService.retrieveMealDescriptionList();
        modelMap.addAttribute("mealDescriptionList", mealDescriptionList);

        Collections.sort(mealDescriptionList, new Comparator<MealDescription>() {
            public int compare(MealDescription m1, MealDescription m2) {

                return m2.getMealDescriptionCreationDate().compareTo(m1.getMealDescriptionCreationDate());
            }
        });
        return "homePage";
    }
}
