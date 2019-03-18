package com.javachallenge;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Week4Challenge {

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> palindrome = new ArrayList<>();

        String[] strArray = { "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer",
                "billy", "did" };

        for (String s : strArray) {
            if (isPalindrome(s)) {
                palindrome.add(s);
            } else
                list.add(s);
        }
        System.out.println("Regular Words: " + list);
        System.out.println("Palindromes: " + palindrome);
        
    }
}
