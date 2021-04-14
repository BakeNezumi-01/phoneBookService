package com.phoneBook.service;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.PhoneFactory;
import com.phoneBook.domain.User;

import java.util.HashMap;

public class PhoneService {

    private static final PhoneFactory phoneFactory = new PhoneFactory();

    public static Phone getPhoneById(Long phoneId){
        HashMap<Long, User> userMap = UserService.getUserMap();
        Phone phone = null;

        for( Long userId : userMap.keySet()){
            if( userMap.get(userId).getPhoneBook().containsKey(phoneId)){
                return userMap.get(userId)
                        .getPhoneBook()
                        .get(phoneId);
            }
        }
        return phone;
    }

    public static PhoneFactory getPhoneFactory() {
        return phoneFactory;
    }

    public static Phone addPhoneToUser(Phone phone, Long userId) {
        phone = phoneFactory.getNewPhone(phone.getFirstName(), phone.getSecondName(), phone.getPhoneNumber());
        UserService.getUserById(userId)
                    .getPhoneBook()
                    .put(phone.getId(), phone);
        return phone;
    }

    public static Phone updatePhoneById(Long phoneId, Phone phone) {
        HashMap<Long, User> userMap = UserService.getUserMap();

        for( Long userId : userMap.keySet()){
            if( userMap.get(userId).getPhoneBook().containsKey(phoneId)){
                 userMap.get(userId)
                        .getPhoneBook()
                        .put(phoneId, phone);
            }
        }
        return phone;
    }

    public static Phone deletePhoneById(Long phoneId) {
        HashMap<Long, User> userMap = UserService.getUserMap();
        Phone phone = null;

        for( Long userId : userMap.keySet()){
            if( userMap.get(userId).getPhoneBook().containsKey(phoneId)){
                userMap.get(userId)
                        .getPhoneBook()
                        .remove(phoneId);
            }
        }
        return phone;
    }

    public static HashMap<Long, Phone> searchPhone(String phone) {
        HashMap<Long, User> userMap = UserService.getUserMap();
        HashMap<Long, Phone> phoneMap = new HashMap<Long, Phone>();

        for( Long userId : userMap.keySet()){
            for( Long phoneId : userMap.get(userId).getPhoneBook().keySet())
                if( phone.equals(userMap.get(userId).getPhoneBook().get(phoneId).getPhoneNumber())){
                    phoneMap.put(phoneId, userMap.get(userId).getPhoneBook().get(phoneId));
                }
        }
        return phoneMap;
    }
}
