package CS116Lab6Part2;
import java.util.ArrayList;
import java.util.List;
public class Pair<T,U> {
    private T first;
    private U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }
    public boolean isEqualTo(Object other) {
        if(other == null || getClass() != other.getClass()){
            return false;
        }
        Pair<T,U> otherPair = (Pair<T,U>) other;
        return first.equals(otherPair.first) && second.equals(otherPair.second);
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(116, "hi");
        Pair<String, Double> pair2 = new Pair<>("Alice", 3.14);
        System.out.println("Type of pair1: " + pair1.getClass().getName().getSimpleName() +
                "and Second is " + pair1.getSecond().getClass().getName().getSimpleName());

        System.out.println("Type of pair2: First is " + pair2.getFirst().getClass().getName().getSimpleName() +
                "and Second is " + pair2.getSecond().getClass().getName().getSimpleName());

        System.out.println("Pair1: First is " + pair1.getFirst() + " and Second is " + pair1.getSecond());
        System.out.println("Pair2: First is " + pair2.getFirst() + " and Second is " + pair2.getSecond());

        pair1.setFirst(549);
        pair2.setSecond(4.00);

        System.out.println("Modified Pair 1: " + pair1);
        System.out.println("Modified Pair 2: " + pair2);

        boolean equalPairs = pair1.isEqualTo(pair2);
        System.out.println("Are the pairs equal? " + equalPairs);
    }
}
