package com.atqc1;

public class Parrot extends Pet implements Fly{

    Parrot(String price) {
        super(price);
    }

    public String fly() {
        return "I can fly!";
    }

    public void petSound() {
        System.out.println("Ar-Ar! Hello!");

    }
}
