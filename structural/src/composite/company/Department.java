package composite.company;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee{
    private String departmentName;
    List<Employee> employees = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department is : "+departmentName);
        for(Employee employee : employees){
            employee.showDetails();
        }
    }
}
