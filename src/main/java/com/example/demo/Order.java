package com.example.demo;

import java.util.List;

import com.example.demo.payment.PaymentStrategy;
import com.example.demo.delivery.DeliveryStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private List<Item> items;
    private int orderId;
    private double totalPrice;
    private static int orderCount = 0;
    private boolean is_paid = false;
    private DeliveryStrategy wayOfDelivery;
    public Order(List<Item> items){
        this.items = items;
        this.orderId = orderCount++;
        totalPrice = 0;
        for(Item item : items){
            totalPrice += item.getPrice();
        }
    }
    public void addItem(Item item){
        items.add(item);
        totalPrice += item.getPrice();
    }
    public void removeItem(Item item){
        items.remove(item);
        totalPrice -= item.getPrice();
    }
    public void pay(PaymentStrategy paymentStrategy){
        if (paymentStrategy.pay(totalPrice)){
            is_paid = true;
        }
    }
    public void setDeliveryStrategy(DeliveryStrategy wayOfDelivery){
        this.wayOfDelivery = wayOfDelivery;
    }
    public void deliver(){
        if (is_paid){
            wayOfDelivery.deliver();
        }
    }
}
