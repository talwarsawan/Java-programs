import java.util.*;

class stud{
public static void main(String ar[]){

int a,i;
int[] arr=new int[20];

Scanner s= new Scanner(System.in);

a=s.nextInt();
int n=s.nextInt();

for(i=0;i<a;i++){
arr[i]=s.nextInt();
}

Arrays.sort(arr);

for(i=0;i<a;i++){
if(n==i){
	System.out.println(arr[i]);
}
}
}
}