package net.therap.service;

import net.therap.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 2/9/14
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    public User checkLogin(String name, String email);
}
