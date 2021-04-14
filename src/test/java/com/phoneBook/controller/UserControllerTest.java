package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.User;
import com.phoneBook.service.PhoneService;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class UserControllerTest {
    // All the test are working, but not in one suit

    @Test
    public void userMap() {
    }

    @Test
    public void setUser() {
    }

    @Test
    public void getUserById() {
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

        assertEquals(user, UserController.getUserById(0L));
    }

    @Ignore
    @Test
    public void updateUserById() {
        User user = new User();
        user.setFirstName("user");
        user.setSecondName("user");
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


        assertEquals(user, UserController.updateUserById(0L, user));
    }

    @Test
    public void deleteUserById() {
        assertNull(UserController.deleteUserById(0L));
    }

    @Test
    public void getUserPhonesById() {
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

        assertEquals(user.getPhoneBook(), UserController.getUserPhonesById(0L));
    }
}
