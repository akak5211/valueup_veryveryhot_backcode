package com.valueup.veryveryhot.Controller;

import com.valueup.veryveryhot.Model.User;
import com.valueup.veryveryhot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @RequestMapping(value = "api/v1/user", method = {RequestMethod.POST})
        public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping(value = "{id}")
    public void removeUser(@PathVariable String id){
        userService.removeUser(id);
    }

}
