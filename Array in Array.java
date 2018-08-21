import java.util.*;

class stud{
public static void main(String ar[]){

int a,c,i;

Scanner s= new Scanner(System.in);
a=s.nextInt();

int arr[]= new int[20];
int arr2[]= new int[20];

for(i=0;i<a;i++){
arr[i]=s.nextInt();

if(arr2[arr[i]]>0){
System.out.println(arr[i]);
break;
}
else{
arr2[arr[i]]++;
}
}

}
}