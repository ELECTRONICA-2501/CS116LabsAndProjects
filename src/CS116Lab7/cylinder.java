package CS116Lab7;

public class cylinder extends Circle{
    private double base;
    public cylinder(){
        super();
        base = 0;
    }
    public cylinder(double newLength, double newBase){
        super(newLength);
        setBase(newBase);
    }
    public double getBase(){
        return base;
    }
    public void setBase(double newBase){
        base = newBase;
    }
    public double getVolume(){
        return (super.getArea() * base);
    }
    public String toString(){
        return ("cylinder: " + super.toString() + " height: " + base + " volume: " + getVolume());
    }
}
