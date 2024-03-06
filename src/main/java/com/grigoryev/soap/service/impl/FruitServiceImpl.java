package com.grigoryev.soap.service.impl;

import com.grigoryev.soap.dto.Fruit;
import com.grigoryev.soap.service.FruitService;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "FruitService")
public class FruitServiceImpl implements FruitService {

    private final List<Fruit> fruits;

    public FruitServiceImpl() {
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Winter fruit"));
        fruits.add(new Fruit("Pineapple", "Tropical fruit"));
    }

    @Override
    public List<Fruit> findAll() {
        return fruits;
    }

    @Override
    public Fruit save(Fruit fruit) {
        fruits.add(fruit);
        return fruit;
    }

    @Override
    public Fruit delete(Fruit fruit) {
        fruits.remove(fruit);
        return fruit;
    }

}
