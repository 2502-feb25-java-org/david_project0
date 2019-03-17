package com.unchecked;

/**
 * Wanting to access non-existent data is another typical 
 * example of unchecked exceptions. Say, you have an array 
 * of six elements and try to print out the item at index 10:
 */

public class InvalidArrayIndex {

	public static void main(String[] args) {
		int myArray[] = {0, 1, 2, 3, 4, 5};

		System.out.println(myArray[10]);

    //As there’s nothing at index 10, the above code example throws ArrayIndexOutOfBoundsException:
    //The most frequent unchecked exception is called NullPointerException. 
    //Added to the list are also: IOException, IllegalArgumentException Concurrent(threading) exceptions, 

	}

}