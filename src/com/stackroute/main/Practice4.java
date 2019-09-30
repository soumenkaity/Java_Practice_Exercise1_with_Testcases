package com.stackroute.main;

import java.util.Scanner;

public class Practice4 {
    public String printPattern(String str){
        int n;
        if(str == null){
            return "No input is given";
        } else {
            try {
                n = Integer.parseInt(str);
            } catch (Exception e) {
                return "Number is not given";
            }
        }
        if(n <= 0){
            return "Number should be greater than 0";
        }
        String ans="";
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                ans += i + " ";
            }
        }
        return ans;
    }
}
