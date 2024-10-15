package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PaymentStrategy;
import com.example.demo.payment.PaypalPaymentStrategy;
public class PaymentTests {
    @Test
    public void testPay(){
        Order order = new Order(List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
            new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
            new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
            new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ));
        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy(1000);
        order.pay(paymentStrategy);
        assertEquals(true, order.getispaid());
        Order order2 = new Order(List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
            new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
            new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
            new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ));
        PaymentStrategy paymentStrategy2 = new PaypalPaymentStrategy(0);
        order2.pay(paymentStrategy2);
        assertEquals(false, order2.getispaid());
    }
}
