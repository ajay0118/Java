//sum of two integers.
import java.util.Scanner;
import java.io.*;
public class Addition
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		int n1;
		int n2;
		int sum;
	
		System.out.println("Enter first number: ");	
		n1 = input.nextInt();
	
		System.out.println("Enter second number: ");
		n2 = input.nextInt();
	
		sum = n1 + n2;
	
		System.out.printf("sum is %d%n",sum);
	}
}


//output :
/*
Enter first number: 
2
Enter second number: 
3
sum is 5
*/

