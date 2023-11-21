package CS116Lab9;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double newRadius){
        super(newRadius);
    }
    public double resize(int percent){
        return (radius * percent);
    }
}
