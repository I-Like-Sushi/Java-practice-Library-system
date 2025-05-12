import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {


    private static Map<String, List<Object>> employees = new HashMap<>();
    private String name;
    private String lastName;
    private int age;
    private static int employeeIdNumberCounter = 0;
    private final int employeeIdNumber;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.employeeIdNumber = ++employeeIdNumberCounter;
        String fullname = name + " " + lastName;
        List<Object> employeesList = Arrays.asList(age, employeeIdNumber);
        employees.put(fullname, employeesList);
    }

    public void setEmployee(String name, String lastName, int age, int idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEmployeeName() { return "Name: " + name + " " + lastName + " "; }

    public String getEmployeeAge() {
        return "Age: " + age;
    }

    public String getEmployeeIDNumber() {
        return "ID: " + employeeIdNumber;
    }

    public static Map<String, List<Object>> getAllEmployees() {
        return employees;
    }
}
