import java.util.Scanner;

public class DivideByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to divide 20 by: ");

        try {
            String input = scanner.nextLine();
            int divisor = Integer.parseInt(input);
            int result = 20 / divisor;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
