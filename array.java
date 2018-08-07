import java.util.*;

class student{

public static void main(String ar[]){
System.out.println("How many elements");
Scanner s= new Scanner(System.in);

int e= s.nextInt();


int arr[]= new int[e];
int i;

for(i=0;i<e;i++){
arr[i]=s.nextInt();
}

int count[] = new int[e];

System.out.println("Repeating elements are:");
for(i=0;i<e;i++)
{
if(count[arr[i]]>=1)
System.out.println(arr[i]+" ");
else
count[arr[i]]++;
}

}
}
