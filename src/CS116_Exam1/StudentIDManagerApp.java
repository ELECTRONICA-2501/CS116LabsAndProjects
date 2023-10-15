package CS116_Exam1;
import java.util.Arrays;

public class StudentIDManagerApp {
    public static void main(String[] args) {
        //StudentIDManager manager = new StudentIDManager(new int[]{10});
        StudentIDManager manager = new StudentIDManager(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
        manager.addStudentID(10, 0);
        manager.removeStudentID(10);
        manager.sortStudentID();
        System.out.println(manager.getSortedStudentID());
        System.out.println(manager.getStudentIDAt(0));
        System.out.println(manager.getTotalStudents());

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("orginal array: ");
        printArray(numbers);
        //print original array
        modifyArray(numbers);
        //modify array
        System.out.println("\nArray after modifyArray: ");
        printArray(numbers);
    }
    public static void modifyArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
