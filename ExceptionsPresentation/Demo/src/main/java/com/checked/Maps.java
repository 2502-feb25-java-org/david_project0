package com.checked;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}