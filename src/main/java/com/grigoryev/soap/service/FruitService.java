package com.grigoryev.soap.service;

import com.grigoryev.soap.dto.Fruit;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface FruitService {

    @WebMethod
    List<Fruit> findAll();

    @WebMethod
    Fruit save(Fruit fruit);

    @WebMethod
    Fruit delete(Fruit fruit);

}
