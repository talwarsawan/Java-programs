import java.util.*;

class a{
public static void main(String ar[]){

int[] arr= new int[20];
Scanner s= new Scanner(System.in); 
int len,i,sum=0,a,n=0,k;

k=s.nextInt();

while(k!=0){
a=k%10;
sum=sum+a;
n=n+sum;
k=k/10;
}

System.out.println(n);

}
}