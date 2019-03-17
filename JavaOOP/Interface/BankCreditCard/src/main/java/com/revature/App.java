package com.revature;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ChaseBank chase = new ChaseBank();
        double interestRate = chase.getRateofInterest();
        double discount = chase.discount(7.2);
        System.out.println("Interest Rate: " + interestRate + " Discount: " + discount);
    }
}
