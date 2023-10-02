package CS116Lab3;

public class Problem2 {

    public static void main(String[] args) {
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int sumAll = 0;
        int sumEven = 0;
        int sumOdd = 0;

        // Compute the sums
        for (int index = 0; index < data.length; index++) {
            sumAll += data[index]; // Add to the sum of all elements

            if (data[index] % 2 == 0) {
                sumEven += data[index]; // Add to the sum of even elements
            } else {
                sumOdd += data[index];  // Add to the sum of odd elements
            }
        }

        // Write out the three sums
        System.out.println("Sum of all elements: " + sumAll);
        System.out.println("Sum of even elements: " + sumEven);
        System.out.println("Sum of odd elements: " + sumOdd);
    }
}
