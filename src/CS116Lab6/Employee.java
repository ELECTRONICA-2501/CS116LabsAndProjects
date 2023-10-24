package CS116Lab6;
import java.util.ArrayList;
public class Employee {
    private int employeeID;
    private String name;
    private Department department;
    enum Department {
       HR, IT, Finance, Marketing
    }
    //create an ArrayList to store list of employees
    private ArrayList<Employee> employees;
    public Employee(int employeeID, String name, Department department){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public Department getDepartment(){
        return department;
    }
    public String toString(){
        return "Employee ID: " + employeeID + " Name: " + name + " Department: " + department;
    }
}
