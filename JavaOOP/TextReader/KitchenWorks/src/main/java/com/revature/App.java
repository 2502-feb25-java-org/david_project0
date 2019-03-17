package com.revature;

import java.io.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        List<String> list = new ArrayList<>();

        try{
		File file = new File("C:\\David\\Learning\\david_project0\\JavaOOP\\TextReader\\KitchenWorks\\src\\main\\java\\com\\revature\\recipe.txt");
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine()) {
			String line = reader.nextLine();
			list.add(line);			
		}
		for(String s: list){
			System.out.println(s);
			
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }finally{
     
    }
        
    }
        

		
    }

