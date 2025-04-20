import java.util.*;
class person{
    int age,marks;
    String dob,name;
    person(int a,String dob,String n,int m){
        age = a;
        marks = m;
        dob = dob;
        name = n;
    }
    void input{
        Scanner sc = new Scanner(system.in);
        System.out.println("enter the name:");
        name = sc.newString();
        System.out.println("enter the age:");
        age = sc.newInt();
        System.out.println("enter the dob:");
        dob = sc.newString();
        System.out.println("enter the marks:");
        marks = sc.newInt();
    }
    void display{
        System.out.primtln("The name of that student:"+name);
        System.out.println("The age of that student:"+age);
        System.out.println("The date of birth of that student:"+dob);
        System.out.println("The marks of that student:"+marks);
    }
    void calmarks{

    }

}