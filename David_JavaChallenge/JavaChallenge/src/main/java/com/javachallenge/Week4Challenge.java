package com.javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Week4Challenge {

    // public static boolean isPalindrome(String str) {
    // return str.equals(new StringBuilder(str).reverse().toString());
    // }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++)
            if (str.charAt(i) != str.charAt(n - i - 1))
                return false;
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> arrayList;
        ArrayList<String> palindrome = new ArrayList<>();

        String[] strArray = { "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer",
                "billy", "did" };

        arrayList = Arrays.asList(strArray);

        for (String s : arrayList) {
            if (isPalindrome(s)) {
                palindrome.add(s);
            } else
                list.add(s);
        }
        System.out.println("Regular Words: " + list);
        System.out.println("Palindromes: " + palindrome);
        //System.out.println(arrayList);

    }
}
