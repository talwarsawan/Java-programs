import java.util.*;

class c1{

int c;

void add(int a,int b){
c=a+b;
System.out.println(c);
}

void sub(int a,int b){
c=a-b;
System.out.println(c);
}

void div(int a,int b){
c=a/b;
System.out.println(c);
}

void mult(int a,int b){
c=a^b;
System.out.println(c);
}

public static void main(String arr[])
{
int a,b,a1,a2,a3,a4,a5;
Scanner s = new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();

c1 c= new c1();

c.add(a,b);
c.sub(a,b);
c.div(a,b);
c.mult(a,b);


}

}