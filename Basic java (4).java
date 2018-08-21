                                                    import  java.util.Scanner;

class Student
{
double rn,marks;
String name[30];

void setData()
{
System.out.println("Input Name and Roll number and marks of the student");
Scanner s1=new Scanner(System.in);

name=s1.next();
rn=s1.nextInt();
marks=s1.nextInt();
}

void getData()
{
System.out.println("Name:"+name);
System.out.println("\n");
System.out.println("Roll number:"+rn);
System.out.println("\n");
System.out.println("marks:"+marks);
}

public static void main(String arr[])
{
Student abc=new Student();
abc.setData();
abc.getData();
}
}