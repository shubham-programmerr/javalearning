import java.util.Scanner;

class shapecalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the shape of your land:");
		System.out.println("1. Rectangle");
		System.out.println("2. Triangle");
		System.out.println("3. Circle");
		System.out.print("Enter your choice (1-3): ");
		int choice = sc.nextInt();

		double areaInSqFt = 0.0;
		switch (choice)
		{
			case 1: // Rectangle
				System.out.print("Enter length (in feet): ");
				double length = sc.nextDouble();
				System.out.print("Enter breadth (in feet): ");
				double breadth = sc.nextDouble();
				areaInSqFt = length * breadth;
				break;
			case 2: // Triangle
				System.out.print("Enter base (in feet): ");
				double base = sc.nextDouble();
				System.out.print("Enter height (in feet): ");
				double height = sc.nextDouble();
				areaInSqFt = 0.5 * base * height;
				break;
			case 3: // Circle
				System.out.print("Enter radius (in feet): ");
				double radius = sc.nextDouble();
				areaInSqFt = Math.PI * radius * radius;
				break;
			default:
				System.out.println("Invalid choice.");
				System.exit(0);
		}

		// Convert square feet to cents (1 cent = 435.6 square feet)
		double areaInCents = areaInSqFt / 435.6;

		System.out.println("Area in square feet: " + areaInSqFt);
		System.out.println("Area in cents: " + areaInCents);

		sc.close();
	}
}