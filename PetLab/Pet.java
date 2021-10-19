package PetLab;

import java.util.ArrayList;

public abstract class Pet implements Comparable<Pet> {
    public String petType;
    public String Speak;
    private String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public Pet(String petType, String Name, String Speak) {
        this.petType = petType;
        this.Name = Name;
        this.Speak = Speak;
    }

    @Override
    public String toString() {
        return "  " +
                "pet is " + petType + '\'' +
                ", Name is " + Name + '\'' +
                ", pet says " + Speak + '\'' +

                ' ';
    }


    public static void speech(ArrayList<Pet> pets) {
        for (Pet pets1 : pets) {
            System.out.println(pets1.Speak);

        }


    }

    @Override
    public int compareTo(Pet pet) {
        return this.getName().compareTo(pet.getName());
    }
}



