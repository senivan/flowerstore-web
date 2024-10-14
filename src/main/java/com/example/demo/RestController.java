package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@SpringBootApplication
public class RestController {
    public static void main(String[] args) {
        SpringApplication.run(RestController.class, args);
    }

    @GetMapping("/flowers")
    public String hello() {
        return List.of(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0),
                new Flower(FlowerType.TULIP, FlowerColor.YELLOW, 4.0, 5.0),
                new Flower(FlowerType.ROSE, FlowerColor.WHITE, 6.0, 12.0),
                new Flower(FlowerType.TULIP, FlowerColor.RED, 3.0, 4.0)
        ).toString();
    }
}
