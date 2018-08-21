import java.util.Scanner;

class circle
{
int r;
double area;

void setData()
{
Scanner s1=new Scanner(System.in);

r=s1.nextInt();
area=3.14*r*r;
}

void getData()
{
System.out.println("The area of the circle is"+area);
}

public static void main(String arr[])
{
circle c=new circle();
c.setData();
c.getData();
}
}