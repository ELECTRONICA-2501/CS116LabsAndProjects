package CS116Lab2;

public class Scope {
    // Class-level variable, shared among all instances of the class
    private static int one = 1;

    // Instance variables
    private int two;
    public int three;

    // Class constant with a fixed value
    public static final int FOUR = 4;

    // Constructor: Initializes instance variables and increments 'one'
    public Scope(int w, int x) {
        // Increment 'one' using the auto-increment operator (++)
        one++;


        // Assign 'w' to the 'two' instance variable
        this.two = two;

        // Assign 'x' to the 'three' instance variable
        this.three = three;
    }

    // Method that modifies instance variables
    public void change(int x) {
        // Calculate 'y' as the sum of 'one' and 'x'
        int y = one + x;

        // Update 'two' by multiplying 'one' and 'y'
        two = one * y;

        // Multiply 'three' by the class constant 'FOUR'
        three = three * FOUR;
    }

    // Method to generate a string representation of the object
    public String toString() {
        return "one = " + one + ", two = " + two + ", three = " + three;
    }
}
