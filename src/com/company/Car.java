package com.company;

public class Car implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("The car is closing");
    }
    public void drive() {
        System.out.println("The car is moving");
    }
}
