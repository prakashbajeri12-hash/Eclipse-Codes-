package organization;

 class Employee {
    private int employeeId;
    String department;
    protected double salary;
    public String designation;

    public Employee(int employeeId, String department,
                    double salary, String designation) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

File: EmployeeAccessDemo.java

import organization.Employee;

public class EmployeeAccessDemo {
    public static void main(String[] args) {

        Employee e = new Employee(
            101,
            "Computer",
            50000,
            "Manager"
        );

        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary: " + e.getSalary());

        System.out.println("Designation: " + e.designation);
    }
}
