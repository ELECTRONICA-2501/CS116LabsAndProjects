package CS116Lab3;

public class Problem4{
    public static void main(String[] args) {
        int[] originalArray = {10, 77, 10, 54, -11, 10};

        boolean result = hasSumOfTens(originalArray, 30);

        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Result: " + result);
    }

    public static boolean hasSumOfTens(int[] array, int targetSum) {
        int sum = 0;
        for (int number : array) {
            if (number == 10) {
                sum += number;
            }
        }
        return sum == targetSum;
    }
}
