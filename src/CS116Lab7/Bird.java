package CS116Lab7;

public class Bird extends Animal{
    private String color;

    public Bird(String name, int age, String sound, String color){
        super(name, age, sound);
        setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void fly(){
        System.out.println("Bird: Fly!");
    }
}
