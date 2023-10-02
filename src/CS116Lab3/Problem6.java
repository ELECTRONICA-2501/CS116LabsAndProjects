package CS116Lab3;

public class Problem6 {
    public static void main(String[] args) {
        double[] array = {3.5, 1.2, 9.8, 4.0, 2.1};

        double difference = findDifference(array);

        System.out.println("The difference between the largest and smallest elements is: " + difference);
    }

    public static double findDifference(double[] arr) {
        if (arr.length == 0) {
            // Handle the case of an empty array, or return a default value.
            return 0.0; // You can change this default value as needed.
        }

        double min = arr[0];
        double max = arr[0];

        // Find the minimum and maximum elements in the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate and return the difference between the max and min.
        return max - min;
    }
}

