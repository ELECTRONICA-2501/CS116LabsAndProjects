package CS116Lab8;

public class Square extends Rectangle{
    public Square(){
        System.out.println("Square constructor");
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double newSide){
        width = newSide;
        length = newSide;
    }
    public void setWidth(double newWidth){
        width = newWidth;
        length = newWidth;
    }
    public void setLength(double newLength){
        width = newLength;
        length = newLength;
    }
    public String toString(){
        return ( "side: " + width + " color: " + color + " filled: " + filled);
    }
}
