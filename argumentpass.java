class test
{
    int a;
    void add10(int a){
        a = a+10;
    }
}
class argumentpass{
    public static void main(String[] args)
    {
        test ob =new test();
        int a = 15;
        System.out.println("the value of a is:"+a);
        ob.add10(a);
        System.out.println("the value of a after is:"+a);
    }
}