package com.stacked;

public class StackDemo {
    
        public static void main(String[] args) {
            log("In main method");
        }
    
        public static void log(String s) {
            //write your code here
            String method = Thread.currentThread().getStackTrace()[2].getMethodName();
            String classes = Thread.currentThread().getStackTrace()[2].getClassName();
            System.out.println(classes + ": "+ method + ": " + s);
        }
    }
    