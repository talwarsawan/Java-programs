import java.util.*;

class a{
public static void main(String ar[]){
int arr[]= new int[20];
int a,i,k=-1;

Scanner s= new Scanner(System.in);
a=s.nextInt();

for(i=0;i<a;i++){
arr[i]=s.nextInt();

if(arr[i]==1 || arr[i]==2 || arr[i]==3 || arr[i]==6 || arr[i]==7)
k=0;

else if(arr[i]==0 || arr[i]==4 || arr[i]==6 || arr[i]==9)
k=1;

else if(arr[i]==8)
k=2;

if(k==2)
	break;
}

System.out.println(k);

}
}