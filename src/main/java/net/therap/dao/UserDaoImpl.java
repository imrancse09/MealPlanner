package net.therap.dao;

import net.therap.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User checkLogin(String name, String email) {
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE :name IN u.name AND :email IN u.userEmail", User.class);
        query.setParameter("name", name);
        query.setParameter("email", email);

        List<User> userList = query.getResultList();
        return userList.isEmpty()? null : userList.get(0);
    }
}
