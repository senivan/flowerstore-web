package com.example.demo.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private double ammount;

    public CreditCardPaymentStrategy(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public double getAmmount() {
        return ammount;
    }

    @Override
    public boolean pay(double ammount) {
        if (this.ammount >= ammount) {
            this.ammount -= ammount;
            System.out.println("Paid " + ammount + " using credit card");
            return true;
        }
        System.out.println("Using credit card credit limit");
        this.ammount -= ammount;
        System.out.println("Current credit card balance: " + this.ammount);
        return true;
        

    }

    @Override
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
    
}
