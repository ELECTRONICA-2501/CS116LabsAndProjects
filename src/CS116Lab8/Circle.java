package CS116Lab8;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        System.out.println("Circle constructor");
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return ( "radius: " + radius + " color: " + color + " filled: " + filled);
    }
}
