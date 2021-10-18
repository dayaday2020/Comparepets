package PetLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PetLabMain {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner petnumScanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numPet = petnumScanner.nextInt();

        for (int i = 0; i < numPet; i++) {

            Scanner PetTypeScanner = new Scanner(System.in);
            System.out.println("What kind of pet(s) do you have?");
            String petType = PetTypeScanner.nextLine();
//created a scanner to ask someone the name of their pet
            Scanner PetNameScanner = new Scanner(System.in);
            System.out.println("Whats the pets name?!");
            String PetName = PetNameScanner.nextLine();
//created a scanner to allow the user to put their pets answers
            Scanner Petvoice = new Scanner(System.in);
            System.out.println("Tell your pet to speak.");
            String petAnswer = Petvoice.nextLine();
//Created multiple methods to identify each pet a person owns and creates an object that extends into PETS
            //check if user input matches the object.
            if (petType.equalsIgnoreCase("dog")) {
                //create object if the user input matches the object class
                Dog dog = new Dog(petType, PetName, petAnswer);
                pets.add(dog);
            } else if (petType.equalsIgnoreCase("cat")) {
                Cat cat = new Cat(petType, PetName, petAnswer);
                pets.add(cat);
            } else {
                Hawk newHawk = new Hawk(petType, PetName, petAnswer);
                pets.add(newHawk);
            }
            //print out array for Pets

        }
        Collections.sort(pets);
        System.out.println(pets);

    }

}


