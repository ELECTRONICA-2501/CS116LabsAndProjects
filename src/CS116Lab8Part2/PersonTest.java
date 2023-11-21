package CS116Lab8Part2;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("John", "123 Main St.");
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());
        p1.setAddress("456 Main St.");
        p1.setName("Jane");
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());

        Student s1 = new Student("Joey", "1421 Main St.");
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        s1.setAddress("456 Main St.");
        s1.setName("Jane");
        System.out.println(s1);

        s1.addCourseGrade("CS116", 100);
        s1.addCourseGrade("CS118", 90);
        s1.addCourseGrade("CS120", 80);
        s1.addCourseGrade("CS116", 70);
        s1.addCourseGrade("CS118", 60);
        s1.addCourseGrade("CS120", 50);

        s1.printGrades();
        System.out.println(s1.getAverageGrade());

        Teacher t1 = new Teacher("Jack", "123 Main St.");
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getAddress());
        t1.setAddress("456 Main St.");
        t1.setName("Jane");
        System.out.println(t1);

        t1.addCourse("CS116");
        t1.addCourse("CS118");
        t1.addCourse("CS120");

        //t1.printCourses();
        System.out.println(t1.removeCourse("CS116"));
        //t1.printCourses();

    }
}
