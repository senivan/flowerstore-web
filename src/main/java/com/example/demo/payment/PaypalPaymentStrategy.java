package com.example.demo.payment;

public class PaypalPaymentStrategy implements PaymentStrategy {
    private double ammount;

    public PaypalPaymentStrategy(double ammount) {
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
            System.out.println("Paid " + ammount + " using paypal");
            return true;
        }
        System.out.println("Not enough balance in paypal");
        return false;
        

    }

    @Override
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
    
}
