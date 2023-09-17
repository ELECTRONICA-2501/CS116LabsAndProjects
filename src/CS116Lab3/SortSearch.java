package CS116Lab3;
import java.util.Random;

public class SortSearch {
    //int[] A = {1,6,3,7,2,4,10,25,9,8};
    public void selectionSortA(int[] A) {
        //from ascending order
        for (int i = 0; i < A.length - 1; i++) {
            //start at 0 index and go to last index
            int minIndex = i;
            //set min index to ith element
            for (int j = i + 1; j < A.length; j++) {
                //i+1 represents the next index next to the minIndex
                if (A[j] < A[minIndex]) {
                    //if the next element j is smaller than minIndex, swap them
                    minIndex = j;
                }
            }
            System.out.println("\nIteration " + i + ", min element is: " + A[minIndex]
                    + ", swapping it with: " + A[i]);
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
            //simple swap algorithm
        }
    }

    void selectionSortD(int[] D) {
        //descending order
        for (int i = 0; i < D.length - 1; i++) {
            //start at 0 index and go to last index
            int maxIndex = i;
            //set min index to ith element
            for (int j = i + 1; j < D.length; j++) {
                //i+1 represents the next index next to the maxIndex
                if (D[j] > D[maxIndex]) {
                    //if the next element j is smaller than minIndex, swap them
                    maxIndex = j;
                }
            }
            System.out.println("\nIteration " + i + ", min element is: " + D[maxIndex]
                    + ", swapping it with: " + D[i]);
            int temp = D[maxIndex];
            D[maxIndex] = D[i];
            D[i] = temp;
            //simple swap algorithm
        }
    }


    void insertionSortA(int[] A) {
        for (int i = 1; i < A.length; i++) {
            //outer loop starts at 2nd element (1st index) bc 1st elmnt
            // (0 index) is already considered sorted
            for (int j = i; j > 0; j--) {
                //The inner loop is nested within the outer loop and is responsible for comparing and swapping elements.
                //It starts at j = i, where i is the current position in the outer loop.
                //It continues until j is greater than 0.
                //The purpose of this loop is to compare the element at A[j] with the elements to its left
                // (i.e., A[j-1]) and swap them if necessary to ensure the array remains sorted.
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }

    void insertionSortD(int[] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = i; j > 0; j++) {
                if (A[j] > A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }
    //void BubbleSort(int[] A){
    //    while ( A != true){
    //        for ()
        }
    //}
//}

