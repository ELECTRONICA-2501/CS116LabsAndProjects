package CS116Lab8Part2;

public class Person {
    private String name;
    private String address;

    public Person(){
        System.out.println("Person constructor");
    }

    public Person(String name, String address){
        setName(name);
        setAddress(address);
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setName(String newName){
        name = newName;
    }


    public String toString(){
        return ( "name: " + name + " address: " + address);
    }

}
