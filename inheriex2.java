class a{
    a()
    {
        System.out.println("a's contructor");
    }
}
class b extends a{
    b()
    {
        System.out.println("b's contructor");
    }
}
public class inheriex2{
    public static void main(String args[])
    {
        a h = new a();
        b h1 = new b();
    }
}