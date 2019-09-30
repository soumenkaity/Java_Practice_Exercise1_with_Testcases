package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice2Test {
    public Practice2 practice2;
    @Before
    public void setUp(){
        practice2 = new Practice2();
    }
    @After
    public void tearDown(){
        practice2 = null;
    }
    @Test
    public void givenGoodNumberShouldPrintCorrectMessage(){
        assertEquals("Tom", practice2.checkTomOrJerry("25"));
        assertEquals("Jerry", practice2.checkTomOrJerry("28"));
        assertEquals("this number is not between 20 and 30.", practice2.checkTomOrJerry("34"));
        assertEquals("this number is not between 20 and 30.", practice2.checkTomOrJerry("-21"));
    }

    @Test
    public void givenNullShouldPrintErrorMessage(){
        assertEquals("No input is given",practice2.checkTomOrJerry(null));
    }
    @Test
    public void givenNonNumberShouldPrintErrorMessage(){
        assertEquals("Number is not given",practice2.checkTomOrJerry("sfgh1245"));
        assertEquals("Number is not given",practice2.checkTomOrJerry("1.2345"));
        assertEquals("Number is not given",practice2.checkTomOrJerry("sfgh-1245"));
        assertEquals("Number is not given",practice2.checkTomOrJerry("sfgh12%#"));
    }
}