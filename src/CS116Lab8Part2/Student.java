package CS116Lab8Part2;

public class Student extends Person{
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    public Student(){
        System.out.println("Student constructor");
    }
    public Student(String name, String address){
        super(name, address);
    }
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void printGrades(){
        for(int i = 0; i < numCourses; i++){
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
    public double getAverageGrade(){
        double sum = 0;
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        return sum / numCourses;
    }
    public String toString(){
        return ( "Student: " + super.toString());
    }
}
