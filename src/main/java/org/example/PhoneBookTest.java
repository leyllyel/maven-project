package org.example;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;



public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("John", "123456789");
        assertEquals(1, count);
    }
}
