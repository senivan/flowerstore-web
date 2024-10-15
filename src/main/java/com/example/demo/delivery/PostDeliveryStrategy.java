package com.example.demo.delivery;

public class PostDeliveryStrategy implements DeliveryStrategy {
    private String zip_code;
    @Override
    public boolean deliver() {
        System.out.println("Delivering using post to branch №" + zip_code);
        return true;
    }
    
}
