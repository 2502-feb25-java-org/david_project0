package com.revature;

interface CreditCard {
    double discount(double creditScore); // declaration

    default void hello(){
       
    }
}

interface Bank extends CreditCard {
    double getRateofInterest();

   
}
//abstract and interface questions are key to interviews 

class ChaseBank extends App implements Bank {

    @Override
    public double getRateofInterest() {
        return 3.2;
          }

    @Override
    public double discount(double creditScore) {
        double discountValue = 0.0;
        if(creditScore > 6.8)
            return discountValue = 15.0;
        else
            return discountValue = 7.5; 
    }

}