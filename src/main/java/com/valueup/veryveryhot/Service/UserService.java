package com.valueup.veryveryhot.Service;

import com.valueup.veryveryhot.DAO.UserDAOImpl;
import com.valueup.veryveryhot.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    private final UserDAOImpl userDAO;

    @Autowired
    public UserService(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }

    public User getUser(String id){
        return userDAO.getUserById(id);
    }

    public User getUserByName(String name){
        return userDAO.getUserByName(name);
    }

    public User getUserByUserid(String userid){
        return userDAO.getUserByUserid(userid);
    }

    public User getUserByUseridAndPassword(String userid, String password) {
        return userDAO.getUserByUseridAndPassword(userid, password);
    }

    public User addUser(User user){
        return userDAO.addUser(user);
    }

    public User updateUser(User user){
        return userDAO.updateUser(user);
    }

    public void removeUser(String id){
        User user = userDAO.getUserById(id);
        userDAO.deleteUser(user);
    }

}
