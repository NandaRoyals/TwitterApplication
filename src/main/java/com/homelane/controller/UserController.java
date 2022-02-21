package com.homelane.controller;


import com.homelane.model.User;
import com.homelane.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user){
        return userService.AddUser(user);

    }
    @GetMapping("/getUser")
    public List<User> getUsers(){
        return  userService.getUser();

    }
    @PostMapping("updateUser/{id}")
    public User UpdateUser(@PathVariable("id") int Id, @RequestBody User user) {
        return userService.UpdateUser(Id,user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int Id){
        return userService.deleteUser(Id);
    }
}
