class Company {
    int companyId;
    static String companyName;
    int employeeCount;

    static {
        companyName = "ABC Technologies";
        System.out.println("Class-level initialization has been performed");
    }

    Company(int companyId, int employeeCount) {
        this.companyId = companyId;
        this.employeeCount = employeeCount;
    }

    void displayDetails() {
        System.out.println("Company ID: " + companyId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println();
    }
}

public class CompanyDemo {
    public static void main(String[] args) {

        Company c1 = new Company(101, 50);
        Company c2 = new Company(102, 100);

        c1.displayDetails();
        c2.displayDetails();
    }
}
