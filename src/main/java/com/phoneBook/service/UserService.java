package com.phoneBook.service;

import com.phoneBook.domain.Phone;
import com.phoneBook.domain.PhoneFactory;
import com.phoneBook.domain.User;
import com.phoneBook.domain.UserFactory;

import java.util.HashMap;

public class UserService {
    private static final HashMap<Long, User> userMap = UserService.userMapInit();
    // idk why i can't use db, but that's the rule
    // h2 would be perfect in here and it can let me use @repository and @autowired...
    private static final UserFactory userFactory = new UserFactory();

    public static HashMap<Long, User> searchUserByPartOfName(String partOfName) {
        HashMap<Long, User> matchedUsers = new HashMap<Long, User>();
        for(Long userId : userMap.keySet()){
            if( userMap.get(userId).getFirstName().contains(partOfName)){
                matchedUsers.put(userMap.get(userId).getId(), userMap.get(userId));
            }
        }
        return matchedUsers;
    }

    public static User getUserById(Long userId){
        return userMap.get(userId);
    }

    public static HashMap<Long, User> getUserMap(){
        return userMap;
    }

    public static User addUser(User user){
        user = UserFactory.getNewUser(user.getFirstName(), user.getSecondName());
        return userMap.put(user.getId(), user);
    }

    public static User updateUserById(Long userId, User user){
        user.setId(userId);
        userMap.put(userId, user);
        return user;
    }

    public static User deleteUserById(Long userId){
        userMap.remove(userId);
        return userMap.get(userId);
    }

    public static HashMap<Long, Phone> getPhonesByUserId(Long userId){
        return userMap.get(userId).getPhoneBook();
    }

    public static HashMap<Long, User> userMapInit() {
        // make this work easier, then reading from file
        HashMap<Long, User> userMap = new HashMap<Long, User>();


        User user = UserFactory.getNewUser("firstName", "secondName");
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("firstN1", "secondN1", "88005553535"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("first2", "second2", "890006662525"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("fir3", "sec3", "72563698562"));
        userMap.put(user.getId(), user);

        user = UserFactory.getNewUser("firstN1", "secondN1");
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("sfg", "gdsfg", "88005693599"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("asdfdsf", "secovbnd2", "890006662577"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("bbbbb", "nbvnbn", "72563698588"));
        userMap.put(user.getId(), user);

        user = UserFactory.getNewUser("first2", "second2");
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("sfg", "gdsfg", "88005693599"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("asdfdsf", "secovbnd2", "890006662577"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("bb", "nb", "72563698588"));
        userMap.put(user.getId(), user);

        user = UserFactory.getNewUser("fir3", "sec3");
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("asdfdsf", "secovbnd2", "890006662577"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("firstN1", "secondN1", "88005553535"));
        user.addPhone(PhoneService.getPhoneFactory().getNewPhone("sfg", "gdsfg", "88005693599"));
        userMap.put(user.getId(), user);

        return userMap;
    }

}
