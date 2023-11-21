package CS116Lab7;

public class Circle {
    private double radius;

    public Circle(){
        radius = 0;
    }
    public Circle(double newRadius){
        setRadius(newRadius);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }
    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }
    public String toString(){
        return ( "radius: " + radius);
    }
}
