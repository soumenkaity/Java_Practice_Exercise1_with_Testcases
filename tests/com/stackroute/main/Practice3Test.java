package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice3Test {
    public Practice3 practice3;
    @Before
    public void setUp(){
        practice3 = new Practice3();
    }
    @After
    public void tearDown(){
        practice3 = null;
    }
    @Test
    public void givenStringShouldPrintCorrectMessage(){
        assertEquals("Vowel Consonant Consonant Vowel ", practice3.checkType("abCE"));
        assertEquals("Consonant Vowel Error Vowel Error Consonant ", practice3.checkType("tA%I5b"));
        assertEquals("Vowel Consonant Error Error Error Vowel ", practice3.checkType("Ob5.7U"));
    }

    @Test
    public void givenNullShouldPrintErrorMessage(){
        assertEquals("No input is given",practice3.checkType(null));
    }
}