// demontration of THIS keyword
class Box {
	double length,width,height;
	Box(double length,double width,double height)
	{
		this.length = length;      // this keyword 
		this.width = width;       
		this.height = height;
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
public class boxthis
{
	public static void main(String[] args)
   	{
		Box box1=new Box(1,2,3);

		box1.displaydetail();

		System.out.println("end");

	}
}
