package com.example.demo.payment;

public interface PaymentStrategy {
    public double getAmmount();
    public boolean pay(double ammount);
    public void setAmmount(double ammount);
}
