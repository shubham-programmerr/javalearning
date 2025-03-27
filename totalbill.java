import java.util.*;
class bill
{
    String[] item = new String[100];
    double[] qty = new double[100];
    double[] price = new double[100];
    int n;
    double totalbill;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of item you want to buy:");
        n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the item:");
            item[i] = sc.next();

            System.out.println("enter the qty:");
            qty[i] = sc.nextDouble();

            System.out.println("enter the pricr:");
            price[i] = sc.nextInt(); 
      
        }
    }
    void allbill()
    {
        for(int i = 0;i<n;i++)
        {
            totalbill = totalbill + price[i]*qty[i];
        }
        System.out.println("the total bil is:"+totalbill);
    }
}
public class totalbill{
    public static void main(String[] args)
    {
        bill sbill1 = new bill();
        bill sbill2 = new bill();
        
        sbill1.input();
        sbill2.input();

        sbill1.allbill();
        sbill2.allbill();
        

    }

}