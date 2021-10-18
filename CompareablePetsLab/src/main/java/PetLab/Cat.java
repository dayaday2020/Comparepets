package PetLab;

public class Cat extends Pet {
    public Cat(String petType, String Name, String Speak) {
        super(petType, Name, Speak);
    }


    @Override
    public int compareTo(Pet pets) {
        return getName().compareTo(getName());
    }
}
