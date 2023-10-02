package CS116Lab3;
import java.util.Scanner;
public class Problem3 {


    public class PrintArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of items: ");
            int numItems = scanner.nextInt();

            int[] items = new int[numItems];

            if (numItems > 0)
            {
                System.out.print("Enter the value of all items (separated by space): ");
                for (int i = 0; i < numItems; i++)
                {
                    items[i] = scanner.nextInt();
                }
            }

            // Print array contents
            System.out.print("The values are: ");
            //for (int i = 0; i < ; i++) {

            for (int i = 0; i < items.length; i++)
            {
                if (i == 0) {
                    System.out.print(items[i]);
                } else {
                    System.out.print(", " + items[i]);
                }
            }
        }
    }
}

