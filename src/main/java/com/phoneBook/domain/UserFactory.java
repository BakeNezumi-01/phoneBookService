package com.phoneBook.domain;

import java.util.HashMap;

public class UserFactory {
    private static int count = 0;

    public static User getNewUser(String firstName, String secondName){
        User user = new User();
        user.setFirstName(firstName);
        user.setSecondName(secondName);
        user.setPhoneBook(new HashMap<Long, Phone>());
        user.setId(count);
        count++;
        return user;
    }
}
