package com.example.demo.model;

import com.example.demo.FlowerColor;
import com.example.demo.FlowerType;
import com.example.demo.Item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private FlowerColor color;

    @Column(nullable = false)
    private FlowerType type;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false) 
    private double length;

    @Column(nullable = false)
    private String description;

    public Flower(FlowerType type, FlowerColor color, double price, double length) {
        this.color = color;
        this.type = type;
        this.price = price;
        this.length = length;
    }    
    public Flower(Flower flower) {
        this.color = flower.getColor();
        this.type = flower.getType();
        this.price = flower.getPrice();
        this.length = flower.getLength();
    }
}
