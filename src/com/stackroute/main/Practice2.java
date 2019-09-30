package com.stackroute.main;

public class Practice2 {
    public String checkTomOrJerry(String number) {
        int num;

        if(number == null){
            return "No input is given";
        } else {
            try {
                num = Integer.parseInt(number);
            } catch (Exception e){
                return "Number is not given";
            }

        }
        String ans = "";
        if (num > 20 && num < 30) {
            if (num % 2 != 0) {
                ans = "Tom";
            } else {
                ans = "Jerry";
            }
        } else {
            ans = "this number is not between 20 and 30.";
        }
        return ans;
    }
}
