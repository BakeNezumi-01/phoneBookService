package com.phoneBook.controller;

import com.phoneBook.domain.Phone;
import com.phoneBook.service.PhoneService;
import org.junit.*;

import static org.junit.Assert.*;

public class PhoneControllerTest {
    // All the test are working, but not in one suit
    @Test
    public void testSetPhoneByUserId() {
        Phone phone = new Phone();
        phone.setPhoneNumber("88005553535");
        phone.setFirstName("firstN1");
        phone.setSecondName("secondN1");
        phone.setId(0);
        assertEquals(phone, PhoneController.setPhoneByUserId(0L, phone));
    }

    @Test
    public void testGetPhoneById() {
        Phone phone = new Phone();
        phone.setPhoneNumber("88005553535");
        phone.setFirstName("firstN1");
        phone.setSecondName("secondN1");
        phone.setId(0);

        assertEquals(phone, PhoneController.getPhoneById(0L));
    }

    @Ignore
    @Test
    public void testUpdatePhoneById() {
        Phone phone = new Phone();
        phone.setPhoneNumber("");
        phone.setFirstName("");
        phone.setSecondName("");
        phone.setId(0);

        assertEquals(phone, PhoneController.updatePhoneById(0L, phone));
    }

    @Ignore
    @Test
    public void testDeletePhoneById() {
        assertNull(PhoneController.deletePhoneById(0L));
    }
}
