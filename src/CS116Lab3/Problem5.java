package CS116Lab3;

public class Problem5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int size = getArraySize(array);

        System.out.println("The number of elements in the array is: " + size);
    }

    public static int getArraySize(int[] arr) {
        return arr.length;
    }
}

