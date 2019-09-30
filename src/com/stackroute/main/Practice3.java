package com.stackroute.main;

public class Practice3 {
    public String checkType(String str) {
        if (str == null){
            return "No input is given";
        }
        String ans = "";
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if ("aeiouAEIOU".indexOf(String.valueOf(ch)) >= 0) {
                    ans += "Vowel ";
                } else {
                    ans += "Consonant ";
                }
            } else {
                ans += "Error ";
            }
        }
        return ans;
    }
}
