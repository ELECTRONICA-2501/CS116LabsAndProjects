package CS116Lab6;
import java.util.ArrayList;
import java.util.List;
public class EmployeeClient {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Jane", Employee.Department.IT));
        employees.add(new Employee(2, "Jack", Employee.Department.Finance));
        employees.add(new Employee(3, "Jill", Employee.Department.Marketing));
        employees.add(new Employee(4, "Jim", Employee.Department.HR));
        employees.add(new Employee(5, "Jenny", Employee.Department.IT));
    }
    private static void printEmployees(ArrayList<Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee);
            System.out.println("\nEmplyees in the IT department: ");
            printEmployeesInDepartment(employees, Employee.Department.IT);
            System.out.println("\nEmplyees with ID 1: ");
            printEmployeeByID(employees, 1);
        }
    }
    private static void printEmployeesInDepartment(ArrayList<Employee> employees, Employee.Department department){
        for (Employee employee : employees){
            if (employee.getDepartment() == department){
                System.out.println(employee);
            }
        }
    }
    private static void printEmployeeByID(ArrayList<Employee> employees, int employeeID){
        for (Employee employee : employees){
            if (employee.getEmployeeID() == employeeID){
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found");
    }
}
