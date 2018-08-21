import java.util.*;

class stud{
public static void main(String ar[]){

int a,n,i,j;

Scanner s= new Scanner(System.in);
a=s.nextInt();

int[] arr= new int[20];

for(i=0;i<a;i++){
arr[i]= s.nextInt();
}

n=s.nextInt();

for(i=0;i<a;i++){
for(j=i+1;j<a;j++){
if((arr[i]+arr[j])==n){
System.out.println(arr[i]+"+"+arr[j]);
}
}
}
}
}