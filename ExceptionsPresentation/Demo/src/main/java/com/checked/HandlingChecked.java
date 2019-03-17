package com.checked;

import java.io.FileWriter;
import java.io.IOException;

/**
 * We enclose the sensitive code that might throw an IOException with a try block.
 * The catch block only fires if the try block throws an IOException.
 */

public class HandlingChecked {

    public static void main(String args[]) { 
        /*
        Besides throw, Java also has a throws statement. 
        It can be used in the signature of any method that might throw a checked exception. 
        */    
    FileWriter myWriter;
 
         try {
 
            myWriter = new FileWriter("C://filenotfound.txt");
 
            myWriter.write("Hi, I'm trying to write something.");
            myWriter.close();

            /*examples of throw statement throw new IOException();
            throw statement can be used with any throwable object that inherits from the Throwable class.
            Each throw statement inside a try block needs to be handled by a corresponding catch block.
            */
 
         } catch (IOException e) {
 
            System.out.println("Exception thrown: " + e);
 
         } catch (Exception e){

            System.out.println("Exception thrown: " + e);

         } finally {
 
            System.out.println("End of execution.");
 
         }
         /**
          * The code throws FileNotFoundException instead of IOException, 
            which is a subclass of IOException and provides the closest description of the issue.
          */
 
    }
 
 }