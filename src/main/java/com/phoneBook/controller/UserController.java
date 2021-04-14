package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.User;
import com.phoneBook.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/")
    public HashMap<Long, User> userMap() {
        return UserService.getUserMap();
    }

    @PostMapping("/")
    public User setUser(@RequestBody User user){
        return UserService.addUser(user);
    }

    @GetMapping("/{id}")
    public static User getUserById(@PathVariable(value = "id") Long userId){
        return UserService.getUserById(userId);
    }

    @PutMapping("/{id}")
    public static User updateUserById(@PathVariable(value = "id") Long userId, @RequestBody User user){
        return UserService.updateUserById(userId, user);
    }

    @DeleteMapping("/{id}")
    public static User deleteUserById(@PathVariable(value = "id") Long userId){
        return UserService.deleteUserById(userId);
    }

    @GetMapping("/phone/{id}")
    public static HashMap<Long, Phone> getUserPhonesById(@PathVariable(value = "id") Long userId){
        return UserService.getPhonesByUserId(userId);
    }
}
