package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.User;
import com.phoneBook.domain.UserFactory;
import com.phoneBook.service.PhoneService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SearchControllerTest {

    @Test
    public void searchUserByPartOfName() {
        User user = new User();
        user.setFirstName("firstName");
        user.setSecondName("secondName");
        user.setId(0);
        user.setPhoneBook(new HashMap<Long, Phone>());
            Phone phone = new Phone();
            phone.setPhoneNumber("88005553535");
            phone.setFirstName("firstN1");
            phone.setSecondName("secondN1");
            phone.setId(0);
        user.addPhone(phone);
            phone = new Phone();
            phone.setPhoneNumber("890006662525");
            phone.setFirstName("first2");
            phone.setSecondName("second2");
            phone.setId(1);
        user.addPhone(phone);
            phone = new Phone();
            phone.setPhoneNumber("72563698562");
            phone.setFirstName("fir3");
            phone.setSecondName("sec3");
            phone.setId(2);
        user.addPhone(phone);

        HashMap<Long, User> userMap = new HashMap<Long, User>();
        userMap.put(0L, user);
        Assert.assertEquals(userMap, SearchController.searchUserByPartOfName("Name"));
    }

    @Test
    public void searchPhone() {
        HashMap<Long, Phone> phoneMap = new HashMap<Long, Phone>();
        Phone phone = new Phone();
            phone.setPhoneNumber("890006662577");
            phone.setFirstName("asdfdsf");
            phone.setSecondName("secovbnd2");
            phone.setId(4);
        phoneMap.put(4L, phone);
        phone = new Phone();
            phone.setPhoneNumber("890006662577");
            phone.setFirstName("asdfdsf");
            phone.setSecondName("secovbnd2");
            phone.setId(7);
        phoneMap.put(7L, phone);
        phone = new Phone();
            phone.setPhoneNumber("890006662577");
            phone.setFirstName("asdfdsf");
            phone.setSecondName("secovbnd2");
            phone.setId(9);
        phoneMap.put(9L, phone);


        Assert.assertEquals(phoneMap, SearchController.searchPhone("890006662577"));
    }
}
