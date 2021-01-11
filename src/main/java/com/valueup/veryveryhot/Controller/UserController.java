package com.valueup.veryveryhot.API;

import com.valueup.veryveryhot.Model.User;
import com.valueup.veryveryhot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/v1/user") //v1 빼니 오류 발생함
@RestController

public class UserController {
    
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Get http methods controllers
    
    @GetMapping
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "{id}")
    public User getById(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    //Non-Get http method controllers

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping(value = "{id}")
    public void removeUser(@PathVariable String id){
        userService.removeUser(id);
    }

}
