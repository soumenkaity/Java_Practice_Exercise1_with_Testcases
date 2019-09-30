package com.stackroute.main;

import java.util.*;

public class Practice1 {
    static boolean checkPalindrome(long num) {
        long rev = 0;
        long temp = num;
        while (temp > 0) {
            rev *= 10;
            rev += temp % 10;
            temp /= 10;
        }
        return rev == num;
    }

    static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0)
                sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public String printAns(String number) {
        long num;
        if(number == null){
            return "No input is given";
        } else {
            try{
                num = Long.parseLong(number);
            } catch (Exception e){
                return "Number is not given";
            }
        }
        if(num < 0){
            return "Palindromic check can't be done on negative numbers";
        }
        String ans = "";
        if (checkPalindrome(num)) {
            if (sumOfDigits(num) > 25) {
                ans = num + " is palindrome and the sum of even numbers is greater than 25";
            } else {
                ans = num + " is palindrome and sum of even numbers is less than 25";
            }
        } else {
            ans = num + " is not palindrome";
        }
        return ans;
    }
}
