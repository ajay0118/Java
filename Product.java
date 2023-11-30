import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, y, z, result;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("\nEnter Second integer: ");
		y = input.nextInt();
		
		System.out.print("\nEnter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.println("\nProduct is :"+result);
	}
	
}

/*

OUTPUT :

	Enter first integer: 1

	Enter Second integer: 3

	Enter third integer: 4

	Product is :12

OUTPUT :

	Enter first integer: 10

	Enter Second integer: 20

	Enter third integer: 50

	Product is :10000


*/

