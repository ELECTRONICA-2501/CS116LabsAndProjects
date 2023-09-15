package CS116Lab2;

public class ScopeTest {
    public static void main(String[] args) {
        Scope a = new Scope(3, 5);
        System.out.println("1. a: " + a);
        a.change(2);
        System.out.println("2. a: " + a);
       // System.out.println(a.two);
       // System.out.println(Scope.three);
        System.out.println(a.FOUR);
        //Scope.FOUR = 5;
        a.three = 3;
        Scope b = new Scope(7,8);
        System.out.println("\n3. a: " + a);
        System.out.println("4. b: " +b);
        a=b;
        a.change(2);
        System.out.println("\n5. a: " +a);
        System.out.println("6. b: " + b);
    }
}
