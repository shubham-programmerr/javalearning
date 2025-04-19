class a{
    a(int a)
    {
        System.out.println("a's contructor");
    }
}
class b extends a{
    b(int a)
    {
        super(a);
        System.out.println("b's contructor");
    }
}
public class inheriex2{
    public static void main(String args[])
    {
        b h1 = new b(10);
    }
}