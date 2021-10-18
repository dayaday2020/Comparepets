package PetLab;

public class Dog extends Pet{
    public  Dog(String petType,String Name, String Speak)
    {
        super(petType, Name, Speak);
    }

    @Override
    public int compareTo(Pet o) {
        return getName().compareTo(getName());
    }
}
