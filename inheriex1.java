class human{
    String name;
    int age;

    human()
    {
        name = " ";
        age = 0;
        System.out.println("\n new born");
    }
    human(String n ,int a)
    {
        name = n;
        age = a;
    }
    human(String n )
    {
        name = n;
        age = 0;
    }
    void speak()
    {
        System.out.println("the name is "+name+" and age is "+age);
    }
}
class student extends human{
    String studentid;
    String standard ;
    student(String n,int a,String sid, String std)
    {
        super(n,a);
        studentid = sid;
        standard = std;
    }
    void speak()
    {
        super.speak();
        System.out.println("I am studying in "+standard+"my id is "+studentid);
    }

}
class pg_student extends student{
    String special;
    pg_student(String name,int age,String studentid,String standard,String spl)
    {
        super(name,age,studentid,standard);
        special = spl;
    }
    void sp()
    {
        System.out.println("the studnet is in post graduation of "+special);
    }
}
public class inheriex1{
    public static void main(String args[])
    {
        human h  = new human("ajay",20);
        student  s = new student("pagal",17,"S12345","12th");
        human h1 = new human();
        pg_student h2 = new pg_student("joy",17,"s12422","13th","cs");
        
        
        h1.speak();
        h.speak();
        s.speak();
        h2.sp();
        h2.speak();
        
    }
}