import java.util.Scanner;

class Circle
{
public static void main(String arr[])
{
	Double radius,area;

	System.out.println("Enter the radius");
	Scanner s1= new Scanner (System.in);

	radius=s1.nextDouble();

	area=3.14*radius*radius;

	System.out.println("The area of the circle is"+area);

}
}