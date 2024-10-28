package com.example.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.example.demo.model.Flower;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    } 

    public double getPrice(){
        return flower.getPrice() * amount;
    }
}
