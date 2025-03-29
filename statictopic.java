class person
{
    int age;
    int height;
    static int totalperson = 0;
    public static void havingfun()
    {
        System.out.println("nice to meet you everyone");
    }
    person(int a,int b)
    {
        age = a;
        height = b;
        totalperson+=1;
    }
}
class statictopic
{
    public static void main(String[] args)
    {
        person p1 =new person(21,165);
        person p2 = new person(53,160);
        System.out.println("p1.total peroson:"+p1.totalperson);
        System.out.println("p2.total person:"+p2.totalperson);

        person.havingfun();
        p1.havingfun();
    }
}