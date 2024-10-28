package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Flower;
import com.example.demo.FlowerColor;
import com.example.demo.FlowerType;
import com.example.demo.Order;
import com.example.demo.repository.AppUserRepository;

import java.util.List;

@SpringBootApplication
@ComponentScan({"com.example.demo.repository.AppUserRepository"})
@org.springframework.web.bind.annotation.RestController
public class RestController {
    public static void main(String[] args) {
        SpringApplication.run(RestController.class, args);
    }

    @GetMapping("/flower")
    public String hello() {
        return List.of(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
                new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
                new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
                new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ).toString();
    }
    @GetMapping("/orders")
    public String orders() {
        return new Order(List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
            new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
            new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
            new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        )).toString();
    }
    @GetMapping("/payment")
    public String payment() {
        return "Payment successful!";
    }
    @GetMapping("/delivery")
    public String delivery() {
        return "Delivery successful!";
    }
}
