class a{
    int num1;
    int num2;
    a(int n1,int n2){
        num1 = n1;
        num2 = n2;
    } 
    void show()
    {
        System.out.println("i am parent");
    }
}
class b extends a{
    int k;
    b(int a,int b,int c)
    {
        super(a,b);
        k = c;
    }
    void show()
    {
        System.out.println("i am chlid");
    }
}
class poly
{
    public static void main(String args[])
    {
        /*a a1 = new a(1,2);
        a1.show();
        b b1 = new b(1,2,3);
        b1.show();
        a1=b1;
        a1.show();*/
        a a1 = new a(1,2);
        b b1;
        b1 = a1;
        b1.show();
    

    }
}