package com.unchecked;

/**
 * Basic arithmetic errors such as divide by zero 
 * are the easiest example of unchecked exceptions. 
 * For instance, here’s a code example that throws ArithmeticException at runtime:
 *
 */


public class ArithmException {

	public static void main(String[] args) {

		System.out.println("Program starts");

		try
        {
            System.out.println("Before calling method1");
            method1();
            /*
            The exception occurs inside the method1 method. 
            This causes the method to terminate immediately. 
            It would cause the main method to terminate if not for the try-catch block."
            */
            System.out.println("After calling method1. This will never be shown");

        }catch(NullPointerException e){

            System.out.println("Null pointer exeption caught!");
        
        } catch (ArithmeticException e){

			System.out.println("Division by zero. Exception has been caught");
		}
        
        System.out.println("Program is still running");
    }

    public static void method1()
    {
        int a = 100;
        int b = 0;
		int c = a/b;

	    System.out.println("Result: " + c);
	}
}

