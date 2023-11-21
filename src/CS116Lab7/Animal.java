package CS116Lab7;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public void makeSound(){
        System.out.println("Animal: Make Sound!");
    }

    public Animal(){
        name = "";
        age = 0;
        sound = "";
    }
    public Animal(String newName, int newAge, String newSound){
        setName(newName);
        setAge(newAge);
        setSound(newSound);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSound(){
        return sound;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setSound(String newSound){
        sound = newSound;
    }
    public String toString(){
        return ("Name: " + name + " Age: " + age + " Sound: " + sound);
    }
}
