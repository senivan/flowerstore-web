package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.delivery.DeliveryStrategy;
import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.payment.CreditCardPaymentStrategy;

import com.example.demo.model.Flower;

public class DeliveryTests {
    @Test
    public void testDeliver(){
        Order order = new Order(List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
            new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
            new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
            new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ));
        DeliveryStrategy deliveryStrategy = new DHLDeliveryStrategy("Kiev, Khreshchatyk 1");
        order.setDeliveryStrategy(deliveryStrategy);
        order.deliver();
        assertEquals(false, order.getisdelivered());
        order.pay(new CreditCardPaymentStrategy(1000));
        order.deliver();
        assertEquals(true, order.getisdelivered());
        
        
        Order order2 = new Order(List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
            new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
            new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
            new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ));
        DeliveryStrategy deliveryStrategy2 = new PostDeliveryStrategy("12345");
        order2.setDeliveryStrategy(deliveryStrategy2);
        order2.deliver();
        assertEquals(false, order2.getisdelivered());
        order2.pay(new CreditCardPaymentStrategy(1000));
        order2.deliver();
        assertEquals(true, order2.getisdelivered());
    }
}
