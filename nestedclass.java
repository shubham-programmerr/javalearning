class outer
{
    int outer_x = 100;
    public Object inner;
    void text()
    {
        inner inner = new inner();
        inner.display();
    }
    public class inner{
        void display(){
            System.out.println("outer_x ="+outer_x);
        }
    }
}
class nestedclass
{
    public static void main(String args[])
    {
        outer ob = new outer();
        ob.text();

    }
}