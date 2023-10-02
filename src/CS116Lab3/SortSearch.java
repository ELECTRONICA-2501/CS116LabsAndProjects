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
        for (int i = 1; i < A.length-1; i++) {
            for (int j = i; j > 0; j++) {
                if (A[j] > A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }
    void BubbleSort(int[] A){
        int i, j , temp;
        boolean swapped;
        for(i = 0; i < A.length-i-1; i++){
            //          n-i-1^^
            swapped = false ;
            for (j =0; j < A.length -i -1;j++){
                if (A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            //if no two elements are swapped within inner loop, break
        }
    }
    String[] sortArrayOfStrings(String[] array){
        for(int i =0; i < array.length; i++){
            String key = array[i];
            int j = i-1;

            while ( j>=0 && array[j].compareTo(key) >0){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        return array;
    }
    void shuffle(int[] A){
        Random rando = new Random();

        for (int i = A.length-1; i>0; i--){
            int j = rando.nextInt(i+1);
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    int find(int[] A, int N){
        for (int i = 0; i < A.length; i++){
            if(A[i] == N){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(int[] A, int N){
        int l =0;
        int r = A.length -1;
        while (l <= r) {
            // Start a while loop that continues as long as the left boundary l
            // is less than or equal to the right boundary r.
            // This loop will keep executing until the search range is valid
            // (i.e., not empty).
            int mid = l + (r - l) / 2;
            //Calculate the middle index of the current search range using integer
            // division. The variable mid stores the index
            // that divides the search range into two equal parts.

            if (A[mid] == N) {
                return mid;
                // Check if the element at the middle index mid of
                // the array A is equal to the target value N. If it is, then
                // the search is successful, and we return mid, which is the index
                // where N was found.
            }
            if (A[mid] < N) {
                l = mid + 1;
                //If the element at mid is less than the target value N, it means that
                // the target value must be on the right side of the current search range.
                // Therefore, update the left boundary l to mid + 1, effectively
                // narrowing the search range to the right half of the current range.
            } else {
                r = mid - 1;
                // If the element at mid is greater than the target value N, it means that
                // the target value must be on the left side of the current search range.
                // Therefore, update the right boundary r to mid - 1, effectively narrowing
                // the search range to the left half of the current range.
                // End of the if-else block. The loop continues to iterate,
                // narrowing down the search range with each iteration, until either
                // the target value N is found (in which case, the index where it was
                // found is returned) or the search range becomes empty (in which case,
                // the loop terminates).
            }
        }
        return -1;
        // If the while loop completes without finding the target value N within
        // the array, this line is reached, and -1 is returned to indicate that the
        // target value was not found in the array.
    }
}

