import java.util.Scanner;

public class totaldis 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        
        System.out.println("what is the discount:");
        double discount = sc.nextDouble();

        double totalPrice = quantity * unitPrice;

        double total_dis = totalPrice * discount/100;
        double totalst = totalPrice  - total_dis;

        System.out.println("Total price: " + totalPrice);

        System.out.println("discount of "+discount+"% :"+total_dis);
        System.out.println("Total price of discount of "+discount+"% :"+totalst);

        sc.close();
    }
}