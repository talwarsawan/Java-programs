import java.util.*;

class a{
public static void main(String ar[]){
int arr[]= new int[20];
int a,i,sum=0,j;
Scanner s= new Scanner(System.in);

System.out.println("Enter the number of elements");
a=s.nextInt();

for(i=0;i<a;i++){
arr[i]=s.nextInt();
}

for(i=0;i<a;i++){
for(j=0;j<a;j++){
if(i!=j)
if(arr[i]==arr[j]){
arr[j]++;
}
}
}

for(i=0;i<a;i++)
{
sum=sum+arr[i];
}
System.out.println(sum);

}
}