package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice1Test {
    public Practice1 practice1;
    @Before
    public void setUp(){
        practice1 = new Practice1();
    }
    @After
    public void tearDown(){
        practice1 = null;
    }
    @Test
    public void givenGoodNumberShouldPrintCorrectMessage(){
        assertEquals("765434567 is palindrome and sum of even numbers is less than 25", practice1.printAns("765434567"));
        assertEquals("845262548 is palindrome and the sum of even numbers is greater than 25", practice1.printAns("845262548"));
        assertEquals("5632781 is not palindrome", practice1.printAns("5632781"));
    }
    @Test
    public void givenNegativeNumberShouldPrintErrorMessage(){
        assertEquals("Palindromic check can't be done on negative numbers",practice1.printAns("-23451"));
    }
    @Test
    public void givenNullShouldPrintErrorMessage(){
        assertEquals("No input is given",practice1.printAns(null));
    }
    @Test
    public void givenNonNumberShouldPrintErrorMessage(){
        assertEquals("Number is not given",practice1.printAns("sfgh1245"));
        assertEquals("Number is not given",practice1.printAns("1.2345"));
        assertEquals("Number is not given",practice1.printAns("sfgh-1245"));
        assertEquals("Number is not given",practice1.printAns("sfgh12%#"));
    }
}