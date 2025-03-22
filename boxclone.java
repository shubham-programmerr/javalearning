class box{
	double length,width,height;
	box(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
	box(box ob)
	{
		width = ob.width;
		height = ob.height;
		length = ob.length;
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


class boxclone 
{
	public static void main(String[] args)
   	{
		box mybox = new box(1,2,3);
		box boxclone = new box(mybox);
		mybox.displaydetail();
        System.out.println("\n");
		boxclone.displaydetail();


		/*System.out.println("box1 volumne="+box1.calculatevolume());
		System.out.println("box1 volumne="+box2.calculatevolume());*/
        
	}
}

