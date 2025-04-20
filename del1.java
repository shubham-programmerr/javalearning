import java.util.*;
class person{
    int age,marks;
    String dob,name;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name:");
        name = sc.nextLine();
        System.out.println("enter the age:");
        age = sc.nextInt();
        System.out.println("enter the dob:");
        dob = sc.nextLine();
        System.out.println("enter the marks:");
        marks = sc.nextInt();
    }
    void display(){
        System.out.primtln("The name of that student:"+name);
        System.out.println("The age of that student:"+age);
        System.out.println("The date of birth of that student:"+dob);
        System.out.println("The marks of that student:"+marks);
    }
}
class del1{
    public static void main(String[] args)
    {
        int m,a;
        String name,dob;
        person p1  = new perosn();
        p1.input();
        p1.display();
    }
}