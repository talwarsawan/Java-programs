import java.util.*;

class calc{

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
	calc c1 = new calc();
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int b= s.nextInt();

	c1.add(a,b);
	c1.div(a,b);
	c1.mult(a,b);
	c1.po(a,b);
	

}
}