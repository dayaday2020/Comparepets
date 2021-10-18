package PetLab;

public class Hawk extends Pet{
    public Hawk(String petType, String Name, String Speak)
    {
        super(petType, Name, Speak);
    }

    @Override
    public int compareTo(Pet o) {
        return getName().compareTo(getName());
    }
}
