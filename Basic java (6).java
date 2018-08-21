import java.util.*;

class test
{
	int a,b;
	public static void main(String arr[])
	{
	test t=new test();
	t.sum();
	}

test()
{
Scanner s1=new Scanner (System.in);
System.out.println("Enter two values");
a=s1.nextInt();
b=s1.nextInt();
}

public void sum()
{
System.out.println("Sum is "+(a+b));
}
}