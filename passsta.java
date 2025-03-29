class person
{
    int height;
    person(int h)
    {
        height = h;
    }
    person add10(person p)
    {
        person temp = new person(height+10);
        return temp;
    }
}
class passsta
{
    public static void main(String[] args)
    {
        person p1 = new person(150);
        person p2;
        p2 = p1.add10(p1);
        System.out.println("the height is of person p1:"+p1);
        System.out.println("the height is of person p2:"+p2);
    }
}
