import java.util.*;
class person {
    int age, marks;
    String dob, name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine(); // Use nextLine() for full names

        System.out.println("Enter the age:");
        age = sc.nextInt();

        sc.nextLine(); // Consume the newline left by nextInt()

        System.out.println("Enter the DOB:");
        dob = sc.nextLine(); // Use nextLine() for DOB input

        System.out.println("Enter the marks:");
        marks = sc.nextInt();

        sc.close(); // Close Scanner to prevent resource leaks
    }

    void display() {
        System.out.println("The name of the student: " + name);
        System.out.println("The age of the student: " + age);
        System.out.println("The date of birth of the student: " + dob);
        System.out.println("The marks of the student: " + marks);
    }
}

class del {
    public static void main(String[] args) {
        person p1 = new person();
        p1.input();
        p1.display();
    }
}