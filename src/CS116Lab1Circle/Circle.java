package CS116Lab1Circle;


public class Circle {
    private double radius;
    final double PI = Math.PI;

    public Circle(double r){
        setRadius(r);
    }
    public Circle(){
        setRadius(1.0);

    }

    public void setRadius(double r) {
       if (radius > 0){
           radius = r;
       } else {
           radius = 1.0;
       }
    }

    public double getRadius() {

        return radius;
    }
    public double area(){
        return (Math.pow(radius,2)) * PI;
    }
    public double circumference(){
        return 2*PI*radius;

    }
    public double diameter(){
        return radius*2;
    }

    public String toString(){
        return "Circle with radius " + radius +
                ", diameter " + diameter() +
                ", circumference " + circumference() +
                ", and area " + area();
    }
    public boolean equalsTo(Circle otherCircle) {
        return this.radius == otherCircle.getRadius();

    }

    public double compareTo(Circle otherCircle ) {
        double difference = this.radius - otherCircle.getRadius();

        if (difference > 0) {
            return 1;
        } else if (difference < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
