package com.revature;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //createArrayList();
        createStack();
        creatSet();
    }

    // static void createArrayList(){
    //     List<String> ar = new ArrayList<>();
    //     ar.add("David");
    //     ar.add("Goode");
    //     ar.add(1,"Test");
    //     ar.remove(2);
    //    // ar.add(88);

    //     for (String o : ar) {
    //         System.out.println(o);
    //     }
    //     System.out.println(ar.size());
    //     System.out.println(ar.get(1));
    // }

    static void createStack(){
        Stack<String> stack = new Stack<>();
        stack.push("David");
        stack.push("Goode");
        System.out.println(stack.get(1));
    }
    static void creatSet(){
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "David");
        map.put(2, "Apple");
        map.put(3,"Banana");

        // for (Map.Entry<Integer, String> pair : map.entrySet())
        // {
        //     Integer key = pair.getKey();                      // Key
        //     String value = pair.getValue();                  // Value
        //     System.out.println(key + ":" + value);
        // }


        //type safety
        for(Integer key : map.keySet()){
            System.out.println(key+ " : " + map.get(key));
        }

    }
}
