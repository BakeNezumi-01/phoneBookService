package com.phoneBook.domain;

import java.util.HashMap;
import java.util.Objects;

public class User {
    private String firstName, secondName;
    private long id;
    private HashMap<Long, Phone> phoneBook;

    public String getFirstName() {
        return firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", id=" + id +
                ", phoneBook=" + phoneBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(secondName, user.secondName) &&
                Objects.equals(phoneBook, user.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, id, phoneBook);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public HashMap<Long, Phone> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(HashMap<Long, Phone> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addPhone(Phone phone){
        phoneBook.put(phone.getId(), phone);
    }


}
