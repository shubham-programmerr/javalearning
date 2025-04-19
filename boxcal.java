class box{
	double length,width,height;
	box(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
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
public class boxcal{
	public static void main(String[] args)
   	{
		box box1=new box(1,2,3);
 		box box2= new box(3,4,6);
		
		box1.displaydetail();
		box2.displaydetail();

		/*System.out.println("box1 volumne="+box1.calculatevolume());
		System.out.println("box1 volumne="+box2.calculatevolume());*/
		System.out.println("end");


	}
}

