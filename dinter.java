interface  vechile{
    void model();
    default void sound()
    {
        System.out.println("there is no sound:");
    }
}
class cars implements vechile{
    public void model()
    {
        System.out.println("cars");
}
}
class bike implements vechile{
    public void model()
    {
        System.out.println("cars");
    }
    public void sound()
    {
        System.out.println("hurrrrrr");
    }
}
public class dinter{
    public static void main(String[] args)
    {
        vechile car = new cars();
        vechile bike = new bike();
        car.sound();
        bike.sound();
    }
}