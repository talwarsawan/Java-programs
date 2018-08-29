import java.util.*;

class a{
public static void main(String ar[]){

Scanner s= new Scanner(System.in);
String tex=s.next();

String arr[]= tex.split(" ");
int sum=0,i,k=0,a;
int len=arr.length;

for(i=0;i<len;i++){
sum=sum+arr[i].length();
}

while(!(sum<=9)){
a=0;
while(sum!=0){
a=sum%10;
k=k+a;
sum=sum/10;
}
}

System.out.println(k);


}
}