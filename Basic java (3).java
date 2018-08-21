import java.util.*;

class Area
{
	int area,radius;

	void setData()
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of radius");
	radius=s1.nextInt;
	area=3.14*radius*radius;
	}

	void getData()
	{
	System.out.println("The value of radius is"+area);	
	}

public static void main(String arr[])
{
	Area c1=new Area();
	c1.setdata();
	c1.getdata(); 

}
}