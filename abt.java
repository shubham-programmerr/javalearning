abstract class shape{
    abstract void draw();

    void display()
    {
        System.out.println("this is a shape:");
    }
}
class circle extends shape{
    @Override
    void draw()
    {
        System.out.println("Drawing a circle");
    }
}
class rect extends shape{
    @Override
    void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class abt{
    public static void main(String args[])
    {
        rect r1 = new rect();
        r1.display();
        r1.draw();

        circle c1 = new circle();
        c1.draw();
        
    }
}
