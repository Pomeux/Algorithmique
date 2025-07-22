package com.algo.vrac;


import java.util.List;

public class Vrac {
    public static boolean palindrome(String s) {

        int i=0;
        while(i<s.length()/2) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean palindrome(List<Character> s) {

        int i=0;
        while(i<s.size()/2) {
            if(s.get(i)!=s.get(s.size()-i-1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
