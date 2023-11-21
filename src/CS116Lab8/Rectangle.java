package CS116Lab8;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        System.out.println("Rectangle constructor");
    }
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double newLength){
        length = newLength;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public String toString(){
        return ( "width: " + width + " length: " + length + " color: " + color + " filled: " + filled);
    }
}
