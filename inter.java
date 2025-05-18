interface animal{
    void makesound();
    void eat();
}
class dog implements animal{
    public void makesound()
    {
        System.out.println("bow bow");
    }
    public void eat()
    {
        System.out.println("bone");
    }
}
class cat implements animal{
    public void makesound()
    {
        System.out.println("meow meow0");
    }
    public void eat()
    {
        System.out.println("fish");
    }
}
public class inter{
    public static void main(String[] args)
    {
        animal dog = new dog();
        dog.makesound();
        dog.eat();
        animal cat = new cat();
        cat.makesound();
        cat.eat();
    }
}