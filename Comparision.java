import java.util.Scanner;

public class Comparision
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.print("Enter the first number: ");
		n1 = input.nextInt();
		
		System.out.print("\nEnter the Second number: ");
		n2 = input.nextInt();
		
		if (n1 == n2)
		System.out.println("\nn1 is equal to n2");
		
		if (n1 != n2)
		System.out.println("\nn1 is not equal to n2");
		
		if (n1 < n2)
		System.out.println("\nn1 is lesser than  n2");		
		
		if (n1 > n2)
		System.out.println("\nn1 is greater than n2");
		
		if (n1 <= n2)
		System.out.println("\nn1 is less than or equal to  n2");
		
		if (n1 >= n2)
		System.out.println("\nn1 is greater than or equal to  n2");
	}
	
}
