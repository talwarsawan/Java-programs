import java.util.*;

class aas{
public static void main(String ar[]){
String a1,a2;
int i,l1,l2;
boolean status;

Scanner s= new Scanner(System.in);

a1=s.nextLine();
a2=s.nextLine();

char[] c1= a1.toCharArray();
char[] c2= a2.toCharArray();


Arrays.sort(c2);
Arrays.sort(c1);

status=Arrays.equals(c1,c2);

System.out.println(c1);

if(status)
System.out.println("Anagram");
else
System.out.println("Not Anagram");
}
}