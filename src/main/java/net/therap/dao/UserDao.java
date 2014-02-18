package net.therap.dao;

import net.therap.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    public User checkLogin(String name, String email);
}
