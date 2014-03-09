package net.therap.controller;

import net.therap.model.FoodItem;
import net.therap.model.User;
import net.therap.service.FoodItemService;
import net.therap.validator.FoodItemValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/10/14
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodItemAdditionController {
    @Inject
    private FoodItemService foodItemService;

    @Autowired
    private FoodItemValidator foodItemValidator;

    private FoodItem foodItem;




    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(foodItemValidator);
    }

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public String addItem(ModelMap modelMap) {
        FoodItem foodItem = new FoodItem();
        modelMap.put("foodItem", foodItem);
        return "addFoodItem";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submitItem(@Valid @ModelAttribute(value = "foodItem")FoodItem foodItem, BindingResult result, HttpServletRequest httpServletRequest) {

        if (result.hasErrors()) {
            return "addFoodItem";
        }

        User user = (User) httpServletRequest.getSession().getAttribute("user");
        //FoodItem foodItem1 = new FoodItem(name, date, user);
        foodItemService.insertFoodItem(foodItem);
        return "success";
    }

//    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
//    public String addItem(@ModelAttribute(value="foodItem") @Valid FoodItem foodItem,
//                          BindingResult result,ModelMap modelMap) {
//
//        modelMap.put("foodItem", foodItem);
//
//        if(result.hasErrors()) {
//            return "addFoodItem";
//        }
//
//        foodItemService.insertFoodItem(foodItem);
//        return "success";
//
//    }
//======================this part is from internet==============================================
//    @RequestMapping(value="/create", method=RequestMethod.POST)
//    public ModelAndView createNewShop(@ModelAttribute @Valid Shop shop,
//                                      BindingResult result,
//                                      final RedirectAttributes redirectAttributes) {
//
//        if (result.hasErrors())
//            return new ModelAndView("shop-new");
//
//        ModelAndView mav = new ModelAndView();
//        String message = "New shop "+shop.getName()+" was successfully created.";
//
//        shopService.create(shop);
//        mav.setViewName("redirect:/index.html");
//
//        redirectAttributes.addFlashAttribute("message", message);
//        return mav;
//    }
//=====================================================================================================

//=================this part is from previous working code==================================
//    @ModelAttribute("foodItem")
//    public FoodItem getFoodForm() {
//        return new FoodItem();
//    }
//
//
//    @RequestMapping(value = "/addItem", method = RequestMethod.GET)
//    public String itemAdd(@RequestParam("name") String name, @RequestParam("date") String date, HttpServletRequest httpServletRequest, ModelMap modelMap) {
//
//        User user = (User) httpServletRequest.getSession().getAttribute("user");
//        FoodItem foodItem = new FoodItem(name, date, user);
//        foodItemService.insertFoodItem(foodItem);
//        return "success";
//    }
//====================*** *** ***================================================================




}
