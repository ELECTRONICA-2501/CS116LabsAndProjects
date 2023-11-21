package CS116Lab7;

public class Vehicle {
    private String myBrand, myModel;

    public Vehicle(){
        //default constructor
        myBrand = "unknown";
        myModel = "unknown";
    }
    public Vehicle(String brand, String model){
        setBrand(brand);
        setModel(model);
    }
    public String getBrand(){
        return myBrand;
    }
    public void setBrand(String brand){
        myBrand = brand;
    }
    public String getModel(){
        return myModel;
    }
    public void setModel(String model){
        myModel = model;
    }
    public String toString(){
        return getBrand()+ " " + getModel();
    }
}
