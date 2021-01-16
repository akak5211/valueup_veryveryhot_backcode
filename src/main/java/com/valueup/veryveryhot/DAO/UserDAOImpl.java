package com.valueup.veryveryhot.DAO;

import com.valueup.veryveryhot.Repository.UserRepository;
import com.valueup.veryveryhot.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private final UserRepository UserRepository;


    public UserDAOImpl(UserRepository UserRepository){
        this.UserRepository = UserRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return UserRepository.insert(user);
    }

    @Override
    public User getUserById(String id) {
        Optional<User> User = UserRepository.findById(id);
        return User.get();
    }

    @Override
    public User getUserByName(String name) {
        return UserRepository.findByName(name);
    }

    @Override
    public User getUserByUserid(String userid) {
        return UserRepository.findByUserid(userid);
    }


    @Override
    public User updateUser(User newuser) {
        return UserRepository.save(newuser);
    }

    @Override
    public void deleteUser(User user) {
       UserRepository.delete(user);
    }
}