import java.util.*;

class cal{

int c;

	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int b= s.nextInt();

void add(){
	c=a+b;
	System.out.println("Add "+c);
}

void sub(){
	c=a-b;
	System.out.println("Sub "+c);
}

void mult(){
	c=a*b;
	System.out.println("Mult "+c);
}

void div(){
	c=a/b;
	System.out.println("Div "+c);
}

void po(){
	c=a^b;
	System.out.println("Add "+c);
}

public static void main(String arr[])
{
	
	cal c = new cal();
	c.add();
	c.div();
	c.mult();
	c.po();
	

}

}