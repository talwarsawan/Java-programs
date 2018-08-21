import java.util.Scanner;

class students extends person
{
String k;
double marks,tmarks,percent;

void setData()
{
super.setData();
Scanner s1=new Scanner(System.in);
System.out.println("Enter the total marks");
tmarks=s1.nextDouble();
System.out.println("Enter the marks scored");
marks=s1.nextDouble();
}

void perc()
{
percent=((marks/tmarks)*100);

if(percent>=60)
k="First_Grade";
else if(percent>=50)
k="Second_grade";
else
k="Fail";
}

public static void main(String arr[])
{
students s2=new students();
s2.setData();
s2.perc();
}

}