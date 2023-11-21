package CS116Lab7;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String sound, String breed){
        super(name, age, sound);
        setBreed(breed);
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String newBreed){
        breed = newBreed;
    }
    public void fetch(){
        System.out.println("Dog: Fetch!");
    }

}
