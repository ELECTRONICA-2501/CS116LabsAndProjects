package CS116Lab3;

public class SortSearchTest {
    public static void main(String[] args) {
        //create an instance of the SortSearch class
        SortSearch sorter = new SortSearch();

        //define an array
        int[] A = {1, 6, 3, 7, 2, 4, 10, 25, 9, 8};

        //call selectionSortA
        sorter.selectionSortA(A);
        System.out.println("Sorted Array (Ascending):");
        for (int num : A) {
            System.out.print(num + " ");

        }
        sorter.selectionSortD(A);
        System.out.println("Sorted Array (Decending):");
        for (int num : A) {
            System.out.print(num + " ");
        }
        sorter.insertionSortA(A);
        System.out.println("Sorted Array (Ascending):");
        for (int num : A) {
            System.out.print(num + " ");
        }
        sorter.insertionSortA(A);
        System.out.println("Insertion():");
        for (int num : A) {
            System.out.print(num + " ");
        }
        sorter.insertionSortD(A);
        System.out.println("Insertion():");
        for (int num : A) {
            System.out.print(num + " ");
        }

    }
}

