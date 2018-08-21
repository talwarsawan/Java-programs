import java.util.*;

class employee extends students
{
double id,salary,sal1=0,sal2=0,anual;

void setData()
{
super.setData();

System.out.println("Enter the id of the person");
Scanner s1=new Scanner(System.in);
id=s1.nextDouble();
System.out.println("Enter the monthly salary of the person");
salary=s1.nextDouble();
anual=salary*12;
}

void doData()
{

if(anual<=150000)
{
sal1=(anual-100000);
sal2=((sal1*5)/100);
}

else if(anual<=300000)
{
sal1=(anual-150000);
sal2=(((sal1*5)/100)+7500);
}
}

void printData()
{


System.out.println("Name:"+name);
System.out.println("\n");
System.out.println("ID:"+id);
System.out.println("\n");
System.out.println("Result:"+k);
System.out.println("\n");
System.out.println("Marks:"+marks);
System.out.println("\n");
System.out.println("Percentage:"+percent);
System.out.println("\n");
System.out.println("Anual salary:"+anual);
System.out.println("\n");
System.out.println("Income tax:"+sal2);
System.out.println("Salary in-hand:"+(anual-sal2));
}

public static void main(String arr[])
{
employee e1=new employee();
e1.setData();
e1.perc();
e1.doData();
e1.printData();
}
}