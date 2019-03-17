package com.checked;

/**
 * Checked exceptions are also called compile-time exceptions, 
 * as they arise at compile time. Java code containing any checked 
 * exceptions won’t compile.  
 */

import java.io.FileWriter;

public class FileNotFound {

   public static void main(String args[]) {	

    /**
     * To solve the compilation problem, the method in which the checked exception
     *  occurs needs to either handle or at least specify it. Before showing how 
     * to do that, let’s have a look at Java’s Exception class hierarchy.
     */

      FileWriter myWriter = new FileWriter("C://filenotfound.txt");

      myWriter.write("Hi, I'm trying to write something.");
      myWriter.close();
   }
}