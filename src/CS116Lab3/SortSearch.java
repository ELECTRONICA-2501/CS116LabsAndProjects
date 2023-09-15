package CS116Lab3;
import java.util.Random;

public class SortSearch {
    void selectionSortA(int [] A){
        for (int i = 0; i < A.length - 1; i++){
            //start at 0 index and go to last index
            int minIndex = i;
            //once minIndex is found
            for(int j = i+1; j < A.length; j++){
                if(A[j] < A[minIndex]){
                    minIndex = j;
                }
            }
            System.out.println("\nIteration " + i + ", min element is: " + A[minIndex]
            + ", swapping it with: " + A[i]);
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }
    void selectionSortD(int[] D){

    }
    void insertionSortA(int[] A){

    }
    void insertionSortD(int[] A){

    }
    void BubbleSort(int [] A){

    }
}
