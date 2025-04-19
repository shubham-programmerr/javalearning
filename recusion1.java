class factorial
{
    int fact(int n)
    {
        int result;
        if(n==1)
        {
            return 1;
        }
        result = fact(n-1)*n;
        return result;
    }
}
class recusion1
{
    public static void main(String args[])
    {
        factorial f = new factorial();
        System.out.println("factorial:"+f.fact(5));
    }
}