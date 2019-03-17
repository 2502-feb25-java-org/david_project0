package com.revature;

import java.io.*;
import java.util.*;

public class Read {

    public static void main(String[] args) throws IOException {

        List<Character> list = new ArrayList<>();

        FileInputStream fis = null;
        int i = 0;
        char c;
        byte[] bs = new byte[4];

        try {
            // create new file input stream
            fis = new FileInputStream(
                    "C:\\David\\Learning\\david_project0\\JavaOOP\\TextReader\\KitchenWorks\\src\\main\\java\\com\\revature\\recipe.txt");

            // read bytes to the buffer
            i = fis.read(bs);

            // for each byte in buffer
            for (byte b : bs) {

                // converts byte to character
                c = (char) b;

                // ArrayList<Character> charList = new ArrayList<>();
                // ArrayList<String> slist = new ArrayList<>();

                // String temp;
                // while(c == 0){

                // }
                // print
                // System.out.print(c);
                list.add(c);
            }

        } catch (Exception e) {
            // if any error occurs
            e.getMessage();

        }
        for (Character ch : list) {
            System.out.println(ch);

        }
    }
}