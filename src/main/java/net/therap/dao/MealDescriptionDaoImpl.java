package net.therap.dao;

import net.therap.model.MealDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/12/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class MealDescriptionDaoImpl implements MealDescriptionDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertMealDescription(MealDescription mealDescription) {
        entityManager.merge(mealDescription);
    }

    @Override
    public List<MealDescription> retrieveMealDescriptionList() {
        TypedQuery<MealDescription> query = entityManager.createQuery("SELECT md FROM MealDescription md", MealDescription.class);
        return query.getResultList();
    }

    @Override
    public void incrementLike(int mealDescriptionId) {
        MealDescription mealDescription = entityManager.find(MealDescription.class, mealDescriptionId);
        int i = mealDescription.getLikes()+1;
        mealDescription.setLikes(i);
        entityManager.flush();
    }

    @Override
    public void incrementDisike(int mealDescriptionIdFromDislike) {
        MealDescription mealDescription = entityManager.find(MealDescription.class, mealDescriptionIdFromDislike);
        int i = mealDescription.getDisLikes()+1;
        mealDescription.setDisLikes(i);
        entityManager.flush();
    }
}
