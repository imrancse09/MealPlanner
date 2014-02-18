package net.therap.service;

import net.therap.dao.MealDescriptionDao;
import net.therap.model.MealDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/12/14
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MealDescriptionServiceImpl implements MealDescriptionService {
    @Autowired
    private MealDescriptionDao mealDescriptionDao;

    @Override
    @Transactional
    public void insertMealDescription(MealDescription mealDescription) {
        mealDescriptionDao.insertMealDescription(mealDescription);
    }

    @Override
    @Transactional
    public List<MealDescription> retrieveMealDescriptionList() {
        return mealDescriptionDao.retrieveMealDescriptionList();
    }

    @Override
    @Transactional
    public void incrementLike(int mealDescriptionId) {
        mealDescriptionDao.incrementLike(mealDescriptionId);
    }

    @Override
    @Transactional
    public void incrementDisike(int mealDescriptionIdFromDislike) {
        mealDescriptionDao.incrementDisike(mealDescriptionIdFromDislike);
    }
}
