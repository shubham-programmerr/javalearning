interface greeting{
    private void log(String mesg)
    {
        System.out.println("log :"+mesg);
    }
    default void sayhello(){
        log("hello");
    }
    default void goodbye(){
        log("goodbye");
    }
    default void usermesg(String m)
    {
        log(m);
    }
}
class greeter implements greeting{
    
}
public class privinter{
    public static void main(String[] args)
    {
        greeter g1 = new greeter();
        g1.sayhello();
        g1.goodbye();
        g1.usermesg("helloworld");

    }
}