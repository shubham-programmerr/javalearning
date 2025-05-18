interface math{
    static void add(int a,int b)
    {
        System.out.println( "a+b:"+(a+b));
    }
    static void square(int a)
    {
        System.out.println( "a*b:"+(a*a));
    }
}
public class stinter{
    public static void main(String[] args)
    {
        math.add(12,45);
        math.square(12);
    }
}