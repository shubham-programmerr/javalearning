interface shape{
    void findarea(int a ,int b);
    
}
class rectangle implements shape{
    int lenght ,height;
    rectangle(int a ,int b)
    {
        lenght = a;
        height = b;
    }
    public void findarea( int lenght , int height)
    {

        System.out.println("area of rectangle is:"+(lenght*height));
    }
}
class triangle implements shape{
    int base,height;
    triangle(int a ,int b)
    {
        base = a;
        height = b;
    }
    public void findarea(int base, int height)
    {
        System.out.println("area of triangle is:"+(0.5*base * height));
    }
}
public class areainter{
    public static void main(String[] args)
    {
        rectangle r1 = new rectangle(12,2);
        triangle t1 = new triangle(12,6);
        
        r1.findarea(22,4);
        t1.findarea(33,4);
    }
}
