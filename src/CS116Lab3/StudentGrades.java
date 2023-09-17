package CS116Lab3;
import java.util.Random;
import java.util.Arrays;
public class StudentGrades {
    private int[] grades;
    private int numberOfStudents;
    // Constructor to generate random grades for the given number of students
    public StudentGrades(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        this.grades = new int[numberOfStudents];
        generateRandomGrades();
    }
    // Accessor for grades
    public int[] getGrades() {
        return grades;
    }
    // Mutator for grades
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    // Returns a string representation of the grades
    public String toString() {
        return Arrays.toString(grades);
    }
    // Check if two StudentGrades objects are equal
    public boolean equals(StudentGrades other) {
        return Arrays.equals(grades, other.grades);
    }
    // Sort grades in ascending order
    public int[] sortAscending() {
        int[] sortedGrades = Arrays.copyOf(grades, numberOfStudents);
        Arrays.sort(sortedGrades);
        return sortedGrades;
    }
    // Sort grades in descending order
    public int[] sortDescending() {
        int[] sortedGrades = Arrays.copyOf(grades, numberOfStudents);
        Arrays.sort(sortedGrades);
        for (int i = 0; i < numberOfStudents / 2; i++) {
            int temp = sortedGrades[i];
            sortedGrades[i] = sortedGrades[numberOfStudents - 1 - i];
            sortedGrades[numberOfStudents - 1 - i] = temp;
        }
        return sortedGrades;
    }
    // Grt the highest grade
    public int getHighestGrade() {
        int[] sortedGrades = sortDescending();
        return sortedGrades[0];
    }
    // Get the average grade
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / numberOfStudents;
    }
    // Get the median grade
    public int getMedianGrade() {
        int[] sortedGrades = sortAscending();
        int middle = numberOfStudents / 2;
        if (numberOfStudents % 2 == 0) {
            // If even number of grades, return the average of the middle two
            return (sortedGrades[middle - 1] + sortedGrades[middle]) / 2;
        } else {
            // If odd number of grades, return the middle grade
            return sortedGrades[middle];
        }
    }
    // Get the mode (most frequent grade)
    public int getModeGrade() {
        int[] gradeCounts = new int[101]; // Assuming grades are between 0 and 100
        for (int grade : grades) {
            gradeCounts[grade]++;
        }
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < gradeCounts.length; i++) {
            if (gradeCounts[i] > maxCount) {
                maxCount = gradeCounts[i];
                mode = i;
            }
        }
        return mode;
    }
    // Helper method to generate random grades (for demonstration purposes)
    private void generateRandomGrades() {
        for (int i = 0; i < numberOfStudents; i++) {
            grades[i] = (int) (Math.random() * 101); // Generates random grades between 0 and 100
        }
    }
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades(10); // Example with 10 students
        System.out.println("Grades: " + studentGrades);
        System.out.println("Sorted Grades (Ascending): " + Arrays.toString(studentGrades.sortAscending()));
        System.out.println("Sorted Grades (Descending): " + Arrays.toString(studentGrades.sortDescending()));
        System.out.println("Highest Grade: " + studentGrades.getHighestGrade());
        System.out.println("Average Grade: " + studentGrades.getAverageGrade());
        System.out.println("Median Grade: " + studentGrades.getMedianGrade());
        System.out.println("Mode Grade: " + studentGrades.getModeGrade());
    }
}
