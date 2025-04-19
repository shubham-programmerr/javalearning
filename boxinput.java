import java.util.*;
class box{
	double length,width,height;
	/*box()
	{
		length = l;
		width = w;
		height = h;
	}*/
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length , width ,heigth:");
		length= sc.nextDouble();
		width = sc.nextDouble();
		height= sc.nextDouble();
 	}
	double calculatevolume()
 	{
		return length*width*height;
	}
	double calculatesurface()
	{
		return 2*(length*width+width*height+length*height);
	}
	void displaydetail()
	{
		System.out.println("box dimesions:"+length+"X"+width+"X"+height);	
		System.out.println("volumne="+calculatevolume());
		System.out.println("Surface area="+calculatesurface());
	}
}
public class boxinput{
	public static void main(String[] args)
   	{
		box box1=new box();
 		box box2= new box();
	
		box1.input();
		box2.input();
		
		box1.displaydetail();
		box2.displaydetail();

		/*System.out.println("box1 volumne="+box1.calculatevolume());
		System.out.println("box1 volumne="+box2.calculatevolume());*/
	}
}
