import java.util.Scanner;

public class TallestStu {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter height of student 1 (in cm): ");
double height1 = sc.nextDouble();

System.out.print("Enter height of student 2 (in cm): ");
double height2 = sc.nextDouble();

System.out.print("Enter height of student 3 (in cm): ");
double height3 = sc.nextDouble();

if (height1 >= height2 && height1 >= height3) {
System.out.println("Student 1 is the tallest.");
} else if (height2 >= height1 && height2 >= height3) {
System.out.println("Student 2 is the tallest.");
} else {
System.out.println("Student 3 is the tallest.");
}

sc.close();
}
}