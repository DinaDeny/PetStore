package com.atqc1;

import static com.atqc1.Breed.DOG;
import static com.atqc1.Color.BLACK;
import static com.atqc1.Color.GREEN;

public class App {
    public static void main (String[] args){

        Pet dog = new Dog ("$100", "large Labrador");
        dog.walk();
        dog.setColor("BLACK");
        dog.sell(dog.getPrice());

        Pet cat = new Cat("$25");
        cat.walk();

        Parrot parrot = new Parrot("$150");
        parrot.setColor("GREEN");
        parrot.sell(parrot.getPrice());
        parrot.fly();

        System.out.println(Pet.soldPetCount);

    }
}
