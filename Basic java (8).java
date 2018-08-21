import java.util.Scanner;

class person
{
String name;

void setData()
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the name");
name=s1.nextLine();
}

public static void main(String arr[])
{
person p1=new person();
p1.setData();
}
}