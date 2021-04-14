package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.PhoneFactory;
import com.phoneBook.domain.User;
import com.phoneBook.domain.UserFactory;
import com.phoneBook.service.PhoneService;
import com.phoneBook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {

    @GetMapping("/search/user/{partOfName}")
    public static HashMap<Long, User> searchUserByPartOfName(@PathVariable(value = "partOfName") String partOfName){
        return UserService.searchUserByPartOfName(partOfName);
    }

    @GetMapping("/search/phone/{phone}")
    public static HashMap<Long, Phone> searchPhone(@PathVariable(value = "phone") String phone){
        return PhoneService.searchPhone(phone);
    }
}
