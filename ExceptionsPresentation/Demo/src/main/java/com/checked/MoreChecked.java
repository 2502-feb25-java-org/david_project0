package com.checked;

import java.io.*;

public class MoreChecked {

    public static void main(String[] args) throws IOException{
    
        method1();
   
}
//The code in this example won't compile, because the main method calls method1(), which throws exceptions that have to be caught.
//To make it compile, we need to add exception handling to the main method. You can do this in one of two ways:
//rethrow to caller
//wrap in try catch block
    public static void method1() throws IOException{
        // Throws FileNotFoundException if the file doesn't exist
        
       
            FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");
       
           
        
       
    }
}