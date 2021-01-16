package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public User getUserById(String id);

    public User getUserByName(String name);

    public User getUserByUserid(String userid);

    public User getUserByUseridAndPassword(String userid, String password);

    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(User user);

}
