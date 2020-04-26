package com.atqc1;

public abstract class Pet {
    private String breed;
    private String color;
    private String price;
    static int soldPetCount = 0;

    Pet(String price) {
        setPrice(price);
    }

    String getPrice() {
        return price;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(String price) {
        this.price = price;
    }

    public abstract void petSound();

    void walk() {
        System.out.println("Pets can walk with their owners!");
    }

    void sell(String price) {
        try {
            System.out.println("You can sell this pet with gift for " + price);
            soldPetCount++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry, you don't have enough money to buy this pet. But we can gift you a fish fot your mood!");
        }

    }

    public void buyPet(boolean isSick) throws PetIsSickException {
        if (isSick){
            throw new PetIsSickException("Sorry, this pet is sick for now and he is in vet clinic. We try to cure him as soon as possible!");
        }
        System.out.println("Congrats! This pet is so cute! You have a new family member now!");
    }
}




