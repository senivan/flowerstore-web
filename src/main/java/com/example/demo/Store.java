package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Flower;

public class Store {
    private List<Flower> flowers;
    public Store() {
        this.flowers = new ArrayList<>();
    }
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    public List<Flower> search(Flower flower) {
        List<Flower> result = new ArrayList<>();
        for (Flower f: flowers) {
            if (!(f.getColor().equals(flower.getColor()))) {
                continue;
            }
            if (!(f.getType().equals(flower.getType()))) {
                continue;
            }
            if (f.getLength() != flower.getLength()) {
                continue;
            }
            result.add(f);
        }
        return result;
    }
}
