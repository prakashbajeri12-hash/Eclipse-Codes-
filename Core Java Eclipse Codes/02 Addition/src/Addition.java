import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter the First number :");
	    
	    int a = sc.nextInt();
	    
	    System.out.print("Enter the Second Number :");
	    
	    int b = sc.nextInt();
	    
	    int ans = a + b;
	    
	    System.out.println("Addition : " + ans);

	}

}
