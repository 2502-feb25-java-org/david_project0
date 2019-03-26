package com.checked;

public class HelloWorld{
    public static void main(String[] args) {
        
        String s = "Hello";
        String str = " World!";

        try{
        String abc = s+str;
        throw new HelloException(abc);

        }catch(HelloException e){
            System.out.println(e.toString());
             
        }

    }
}