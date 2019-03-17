package com.revature;

//import java.lang.* call to external or interna 

/**
 * Hello world!
 *
 */
public class App 
{
    
    
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    //     Greeter greet = new Greeter();
    //    // greet.setName("David")
    //     String name = greet.getName();

    //     System.out.println("Hello " + name );

    Person p = new Person("David", "123423");
    //System.out.println(p.getDetails());
    Employee emp = new Employee("Carol Baxter", "12234", 65_000);
    System.out.println(emp.getDetails());
    }
}
