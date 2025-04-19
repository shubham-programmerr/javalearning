import java.util.* ;
public class check{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int time ;
        System.out.println("enter the time:");
        time = sc.nextInt();
        String result = (time<18)? "good day":"good evening";
        System.out.println(result);
    }
}