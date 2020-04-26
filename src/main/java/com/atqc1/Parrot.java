package com.atqc1;

public class Parrot extends Pet implements Fly{

    Parrot(String price) {
        super(price);
    }

    public String fly() {
        return "I can fly!";
    }

    @Override
    public void petSound() {
        System.out.println("Ar-Ar! Hello! I can talk and it's cool!");

    }
}
