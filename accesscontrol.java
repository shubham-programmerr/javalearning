class person
{
    private int age;
    public int height;
     person(int a,int b)
     {
        age = a;
        height = b;
     }
    public int getage()
    {
        return age;
    }
}
class accesscontrol
{
    public static void main(String[] args)
    {
        person p1 =new person(21,165);
        //System.out.println("age of the person is :"+p1.age);
        int tempage = p1.getage();
        System.out.println("age of the person is :"+tempage);
        System.out.println("the height of the person is :"+p1.height);
    }
}