class a{
    int num1;
    int num2;
    a(int n1,int n2){
        num1 = n1;
        num2 = n2;
    } 
    void show()
    {
        System.out.println("i and j :"+num1+" "+num2);
    }
}
class b extends a{
    int k;
    b(int a,int b,int c)
    {
        super(a,b);
        k = c;
    }
    void show(String msg)
    {
        System.out.println(msg+k);
    }
}
class overide
{
    public static void main(String args[])
    {
        b b1 = new b(1,2,3);
        b1.show("this is k:" );
        b1.show();
        a a1 = new a(1,2);
        a1.show();

    }
}