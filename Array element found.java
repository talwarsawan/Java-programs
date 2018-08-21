import java.util.*;

class stud{
public static void main(String ar[]){

int a,i,flag=0;
int[] arr= new int[20];

Scanner s= new Scanner(System.in);

a=s.nextInt();
int n=s.nextInt();

for(i=0;i<a;i++){
arr[i]=s.nextInt();

if(i==n){
	flag=1;
System.out.println(arr[i]);
}
}

if(flag==0){
	System.out.println("Sorry not found!");
}

}
}