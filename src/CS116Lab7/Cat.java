package CS116Lab7;

public class Cat extends Animal{

    private boolean hasFur;
    public boolean hasFur(){
        return hasFur;
    }
    public Cat(String name, int age, String sound, boolean hasFur){
        super(name, age, sound);
        setHasFur(hasFur);
    }
    public void setHasFur(boolean newHasFur){
        hasFur = newHasFur;
    }
    public void stratch(){
        System.out.println("Cat: Scratch!");
    }
    public String toString(){
        return (super.toString() + " Has Fur: " + hasFur);
    }
}
