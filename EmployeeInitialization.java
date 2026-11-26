class Employee {
    int employeeId;
    String employeeName;
    String department;

    static String companyName;

    static {
        companyName = "ABC Technologies";
        System.out.println("Static block executed");
    }

    {
        System.out.println("Employee object created");
    }

    Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Company Name: " + companyName);
        System.out.println();
    }
}

public class EmployeeInitialization {
    public static void main(String[] args) {

        Employee e1 =
            new Employee(101, "Soham", "Computer");

        Employee e2 =
            new Employee(102, "Tanishka", "Accounts");

        Employee e3 =
            new Employee(103, "Shravani", "Management");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
