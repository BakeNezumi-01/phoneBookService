package com.phoneBook.domain;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;

public class PhoneFactory {
    private int count = 0;

    public Phone getNewPhone(String firstName, String secondName, String phoneNumber){
        Phone phone = new Phone();
        phone.setFirstName(firstName);
        phone.setSecondName(secondName);
        phone.setPhoneNumber(phoneNumber);
        phone.setId(count);
        count++;
        return phone;
    }
}
