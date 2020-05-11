package com.atqc1;

public class Parrot extends Pet implements Fly{

    Parrot(String price) {
        super(price);
    }

    @Override
    void setColor(Color color) {
        super.setColor(color);
    }

    public String fly() {
        return "I can fly!";
    }

    @Override
    public void petSound() {
        System.out.println("Ar-Ar! Hello! I can talk and it's cool!");

    }
}
