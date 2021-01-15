package com.valueup.veryveryhot.Controller;

import java.util.List;

import com.valueup.veryveryhot.Model.User;
import com.valueup.veryveryhot.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping(value = "api/v1/user", method = {RequestMethod.GET,RequestMethod.POST}) //v1 빼니 오류 발생함
@RestController

public class UserController {
    
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Get http methods controllers
    
    @RequestMapping(value = "api/v1/user", method = {RequestMethod.GET})
        public List<User> getAll(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "api/v1/user/{id}", method = {RequestMethod.GET})
    public User getById(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    //Non-Get http method controllers

    @RequestMapping(value = "api/v1/user/create", method = {RequestMethod.POST})
    @ResponseStatus(value=HttpStatus.OK)
        public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "api/v1/user/delete{id}", method = {RequestMethod.DELETE})
    public void removeUser(@PathVariable String id){
        userService.removeUser(id);
    }

}
