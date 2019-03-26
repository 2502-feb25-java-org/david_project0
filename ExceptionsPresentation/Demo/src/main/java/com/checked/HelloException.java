package com.checked;

public class HelloException extends Exception{

    private String string;

    public HelloException(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }

    public String getMessage(){
        
        return "Hello World is a boring message :(";
    }
    
}
