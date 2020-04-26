package com.atqc1;

import java.util.ArrayList;

import static com.atqc1.Breed.DOG;
import static com.atqc1.Color.BLACK;
import static com.atqc1.Color.GREEN;

public class App {
    public static void main(String[] args) {

        Pet dog = new Dog("$100", "large Labrador");
        dog.walk();
        dog.setColor("BLACK");
        dog.sell(dog.getPrice(), "DOG");

        Pet cat = new Cat("$25");
        cat.walk();
        cat.sell(cat.getPrice(), "CAT");

        Parrot parrot = new Parrot("$150");
        parrot.setColor("GREEN");
        parrot.sell(parrot.getPrice(), "PARROT");
        parrot.fly();

        System.out.println(Pet.soldPetCount);

        ArrayList<String> soldPets = new ArrayList<>();
        soldPets.add("ELEPHANT");
        soldPets.add("CAT");
        soldPets.add("PARROT");

        soldPets.add(1, "DOG");
        soldPets.remove(0);

        System.out.println("List of pets that we sold yesterday: ");
        for (String pet : soldPets) {
            System.out.println(pet);
        }
    }
}
