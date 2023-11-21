package CS116Lab8Part2;

public class Teacher extends Person{
    private int numCourses = 0;
    private String[] courses = new String[30];

    public Teacher(){
        System.out.println("Teacher constructor");
    }
    public Teacher(String name, String address){
        super(name, address);
    }
    public boolean addCourse(String course){
        for(int i = 0; i < numCourses; i++){
            if(courses[i].equals(course)){
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course){
        for(int i = 0; i < numCourses; i++){
            if(courses[i].equals(course)){
                courses[i] = courses[numCourses - 1];
                numCourses--;
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return ( "Teacher: " + super.toString());
    }
}
