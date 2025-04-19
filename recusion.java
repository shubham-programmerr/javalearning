class recusion
{
    static int fact(int n)
    {
        int result;
        if(n==1)
        {
            return 1;
        }
        result = fact(n-1)*n;
        return result;
    }
    public static void main(String args[])
    {
        int f;
        System.out.println("factorial:"+fact(5));
    }
}