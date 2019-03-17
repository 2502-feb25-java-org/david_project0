package com.stacked;

/**
 * The Java Machine keeps track of all function calls. 
 * For that, it has a special collection – the stack. 
 * When one function calls another, the Java Machine puts 
 * a new StackTraceElement object onto the stack. 
 */

public class ExceptionExample
{
  public static void main(String[] args)
  {
    method1();
  }

  public static void method1()
  {
    method2();
  }

  public static void method2()
  {
    method3();
  }

  public static void method3()
  {
     StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
    }
  }
}