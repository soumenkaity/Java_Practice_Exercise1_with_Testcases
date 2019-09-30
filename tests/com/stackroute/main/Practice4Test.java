package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Practice4Test {
    public Practice4 practice4;
    @Before
    public void setUp(){
        practice4 = new Practice4();
    }
    @After
    public void tearDown(){
        practice4 = null;
    }
    @Test
    public void givenGoodNumberShouldPrintCorrectPattern(){
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ", practice4.printPattern("6"));
        assertEquals("1 2 2 3 3 3 4 4 4 4 ", practice4.printPattern("4"));
    }
    @Test
    public void givenZeroOrNegativeNumberShouldPrintErrorMessage(){
        assertEquals("Number should be greater than 0",practice4.printPattern("-23"));
        assertEquals("Number should be greater than 0",practice4.printPattern("0"));
    }
    @Test
    public void givenNullShouldPrintErrorMessage(){
        assertEquals("No input is given",practice4.printPattern(null));
    }
    @Test
    public void givenNonNumberShouldPrintErrorMessage(){
        assertEquals("Number is not given",practice4.printPattern("sfgh1245"));
        assertEquals("Number is not given",practice4.printPattern("1.2345"));
        assertEquals("Number is not given",practice4.printPattern("sfgh-1245"));
        assertEquals("Number is not given",practice4.printPattern("sfgh12%#"));
    }
}