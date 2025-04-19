class person
{
    int height;
    void add10(person o)
    {
        o.height +=10;
    }
}
class argumentp{
    public static void main(String args[]){
        person ob1 = new person();
        person ob=new person();

        ob1.height = 150;
        System.out.println("the height value is :"+ob1.height);
        ob.add10(ob1);
        System.out.println("the height value is :"+ob1.height);
    }
}