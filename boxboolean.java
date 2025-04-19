class box{
	double length,width,height;
	box(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
	boolean equals(box o )
	{
		if(o.length == this.length && o.width == this.width && o.height == this.height)
		{
			return true;
		}
		else 
			return false;
	}
}

class boxboolean
{
	public static void main(String[] args)
   	{
		box box1=new box(1,2,3);
 		box box2= new box(3,4,6);
        box box3 = new box(1,2,3);
        if(box3.equals(box1))
            System.out.println("the box3 and box1 are equal");
        else
            System.out.println("the box3 and box1 are not equal");
        if(box2.equals(box1))
            System.out.println("the box2 and box1 are equal");
        else
            System.out.println("the box2 is not equal to box1");
		

		/*System.out.println("box1 volumne="+box1.calculatevolume());
		System.out.println("box1 volumne="+box2.calculatevolume());*/
        
	}
}

