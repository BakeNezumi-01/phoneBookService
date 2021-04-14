package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.User;
import com.phoneBook.service.PhoneService;
import com.phoneBook.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/phone")
public class PhoneController {

    @PostMapping("/user/{id}")
    public static Phone setPhoneByUserId(@PathVariable(value = "id") Long userId, @RequestBody Phone phone){
        return PhoneService.addPhoneToUser(phone, userId);
    }

    @GetMapping("/{id}")
    public static Phone getPhoneById(@PathVariable(value = "id") Long phoneId){
        return PhoneService.getPhoneById(phoneId);
    }

    @PutMapping("/{id}")
    public static Phone updatePhoneById(@PathVariable(value = "id") Long phoneId, @RequestBody Phone phone){
        return PhoneService.updatePhoneById(phoneId, phone);
    }

    @DeleteMapping("/{id}")
    public static User deletePhoneById(@PathVariable(value = "id") Long userId){
        return UserService.deleteUserById(userId);
    }

}
