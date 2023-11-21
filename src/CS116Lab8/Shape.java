package CS116Lab8;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        System.out.println("Shape constructor");
    }
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean newFilled){
        filled = newFilled;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    public String toString(){
        return ( "color: " + color + " filled: " + filled);
    }
}
