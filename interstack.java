interface stack1{
    void push(int item);
    void pop();
}
class intStack implements stack1{
    int arr[],top = -1;
    int max = 5;
    int item;

    intStack(int size)
    {
        arr = new int[size];
        top = -1;
    }
    public void push(int item)
    {
        if(top > max-1)
        {
            System.out.println("the stack is overflow");
        }
        else
        {
            arr[++top]= item;
        }
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("the stack is underflow");
        }
        else{
            item = arr[top];
            System.out.println("the  pop item is"+item);
        }

    }
}
public class interstack{
    public static void main(String[] args)
    {
        intStack s1 = new intStack(5);
        s1.push(30);
        s1.push(20);
        s1.push(10);

        s1.pop();
    }
}