package com.test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    public void testToString(){
        // Testing the toString method to make sure leading zeros are added
        Date date = new Date(1, 1, 1991);
        Assertions.assertEquals(date.toString(), "01/01/1991");
    }

    @Test
    public void testSetters(){
        Date date = new Date(1, 1, 1991);
        date.setDate(10, 10, 1991);
        Assertions.assertEquals(date.toString(), "10/10/1991");
    }

    @Test
    public void testToStringType(){
        // Tests the toString method when asking for date in different formats
        Date date = new Date(15, 10, 2022);
        Assertions.assertEquals(date.toString(1), "2022/10/15");
    }
}
