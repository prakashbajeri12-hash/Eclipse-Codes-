import java.util.Scanner;

class Student
{
    int Roll_Number;
    String Name;
    String Course;
    double Marks;

    Student()
    {
        Roll_Number = 0;
        Name = "unknown";
        Course = "not assigned";
        Marks = 0;
    }

    Student(int Roll_Number,String Name, String Course,double Marks)
    {
        this.Roll_Number = Roll_Number;
        this.Name = Name;
        this.Course = Course;
        this.Marks = Marks;
    }

    void display()
    {
        System.out.println("Roll number:"+ Roll_Number);
        System.out.println("name: "+ Name);
        System.out.println("course: "+ Course);
        System.out.println("marks: "+ Marks);
    }
}

public class studentdemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("student 1 details (non-parameterized constructor): ");
        s1.display();

        System.out.println("Enter student 2 details: ");
        System.out.println("enter roll number: ");
        int Roll_Number=sc.nextInt();
        sc.nextLine();

        System.out.println("enter name: ");
        String Name=sc.nextLine();

        System.out.println("enter course: ");
        String Course=sc.nextLine();

        System.out.println("enter marks: ");
        double Marks=sc.nextDouble();

        Student s2 = new Student(Roll_Number,Name,Course,Marks);
        System.out.println("student 2 details (parameterized constructor): ");
        s2.display();

        sc.close();

    }

}
