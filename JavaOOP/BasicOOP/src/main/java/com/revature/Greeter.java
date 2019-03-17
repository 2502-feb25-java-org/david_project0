package com.revature;

//naming convention: Packages - small.case,
//Classes: ProperCase Interface: ProperCase
//variables, methods(verbs) camelCase
//contstans: UPPERCASE

class Greeter{
    private String name;
    public Greeter(){
        name = "Push";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Address{
    String addressLine1;
    String addressLine2;
    String city;
    String zipcode, state, country = "US";
}

abstract class Person{
    String name;
    String ssn;
    final String SPECIES="Homosapiens"; //constant
    public Person(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        //SPECIED = "aldjfalsf" cannot assign any value

    }
    abstract String getMoreDetails();
    String getDetails(){
        return name + " " + ssn + " " + SPECIES;
    }
}

class Employee extends Person{
    double salary;

    public Employee(String name, String ssn, double salary ){
        super(name, ssn);
        this.salary = salary;
    }
    @Override
    String getDetails(){
        return "Name: "+name + " SSN: " + ssn + " Salary: $ " + salary;
    }
    @Override
    String getMoreDetails(){
        return "Name: "+name + " SSN: " + ssn + " Salary: $ " + salary + " Species ID: " +SPECIES;
    }
}