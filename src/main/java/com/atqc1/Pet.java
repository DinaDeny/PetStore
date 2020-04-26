package com.atqc1;

public abstract class Pet {
    private String breed;
    private String color;
    private String price;
    static int soldPetCount = 0;
}

    Pet(String price){
        setPrice(price);
    }

    String getPrice(){
        return price;
    }

    void setBreed (String breed){
        this.breed = breed;
    }

    void setColor (String color){
        this.color = color;
    }

    void setPrice (String price) {
        this.price = price;
    }
