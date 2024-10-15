package com.example.demo.delivery;

public class DHLDeliveryStrategy implements DeliveryStrategy {
    private String address;
    @Override
    public boolean deliver() {
        System.out.println("Delivering using DHL to address: " + address);
        return true;
    }
    public DHLDeliveryStrategy(String address){
        this.address = address;
    }
    
}
