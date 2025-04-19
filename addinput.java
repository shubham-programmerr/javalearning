import java.util.*;
class addinput
{

	public static void main(String args[])
	{

		int a;
		int b;
		int c;
  
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		a=sc.nextInt();

		System.out.println("enter the second number:");
		b=sc.nextInt();

		c=a+b;
		System.out.println("sum of number = "+c);

	}
}