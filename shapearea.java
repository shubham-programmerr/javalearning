import java.util.*;
class shapearea{
	public static void main(String[] args)
	{
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("menu");
		System.out.println("------");
		System.out.println("1. rectangle");
		System.out.println("2. square");
		System.out.println("3. circle");
		System.out.println("enter the number:");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("enter the length and breath:");
				int l = sc.nextInt();
				int b = sc.nextInt();
				int area = l*b;
				System.out.println("The area of rectangle:"+area);
				break;
			}
			case 2:
			{
				System.out.println("enter the side:");
				int side = sc.nextInt();
				int area = side*side;
				System.out.println("The area of square:"+area);
				break;
			}
			case 3:
			{
				System.out.println("enter the radius :");
				int radi = sc.nextInt();
				double area = 2*3.14*radi*radi;
				System.out.println("The area of radius:"+area);
				break;
			}
			case 4:
			{
				System.out.println("exit");
				break;
			}
			default:
			{
				System.out.println("choice is invalid");
				break;
			}
		}
	}
}


				
		
		
		
		
		
		
			