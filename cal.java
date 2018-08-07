import java.util.*;

class cal{

int c;

void add(int a, int b){
	c=a+b;
	System.out.println("Add "+c);
}

void sub(int a, int b){
	c=a-b;
	System.out.println("Sub "+c);
}

void mult(int a, int b){
	c=a*b;
	System.out.println("Mult "+c);
}

void div(int a, int b){
	c=a/b;
	System.out.println("Div "+c);
}

void po(int a, int b){
	c=a^b;
	System.out.println("Add "+c);
}

public static void main(String arr[])
{
	cal c = new cal();
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int b= s.nextInt();

	c.add(a,b);
	c.div(a,b);
	c.mult(a,b);
	c.po(a,b);
	

}

}