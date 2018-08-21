import java.util.*;

class arm
{
	int a,b,c;
	
	arm(int x,int y,int z)
	{
	if(z==1)
	System.out.println("Multiplication: "+(a*b));
	else if(z==2)
	System.out.println("Divide: "+(a/b));
	else if(z==3)
	System.out.println("Add: "+(a+b));
	else if(z==4)
	System.out.println("Subtract: "+(a-b));
	}



	public static void main(String arr[])
	{

int a,b,c;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter two numbers");
	a=s1.nextInt();
	b=s1.nextInt();
	System.out.println("Press 1 to Multiply\nPress 2 to Divide\nPress 3 to Add\nPress 4 to Subtract\n");
	c=s1.nextInt();

	arm a1=new arm(a,b,c);
	}
}