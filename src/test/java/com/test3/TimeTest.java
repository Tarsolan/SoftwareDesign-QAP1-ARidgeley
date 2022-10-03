package com.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testNewMinute(){
        // The minute should advance when the second reaches 60
        Time theTime = new Time(1, 1, 59);
        theTime.nextSecond();
        Assertions.assertEquals(theTime.getMinute(), 2);
    }

    @Test
    public void testNewDay(){
        // The hour should reset to 0 when we enter a new day
        Time theTime = new Time(23, 59, 59);
        theTime.nextSecond();
        Assertions.assertEquals(theTime.getHour(), 0);
    }

    @Test
    public void goBackMinute(){
        // The minute should go back when the second goes past 0
        Time theTime = new Time(12, 30, 0);
        theTime.previousSecond();
        Assertions.assertEquals(theTime.getMinute(), 29);
    }
}
