import java.util.Scanner;
class InvalidRegistrationNumber extends Exception {
    public InvalidRegistrationNumber(String message) {
        super(message);
    }
}

public class RegistrationValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter registration number: ");

        try {
            int regNumber = Integer.parseInt(scanner.nextLine());
            
            if (regNumber < 180953001 || regNumber > 180953100) {
                throw new InvalidRegistrationNumber(
                    "Invalid Registration Number: Number must be between 180953001 and 180953100."
                );
            }

            System.out.println("Valid Registration Number.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (InvalidRegistrationNumber e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}