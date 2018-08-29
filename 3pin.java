import java.util.*;

class av{
public static void main(String ar[]){

int a,len,len2,len3,b,c,k,max=-10,min=100,i,j;
int[] arr= new int[20];
int[] arr2= new int[20];
int[] arr3= new int[20];

Scanner s= new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();


for(i=0;i<3;i++){
k=a%10;
arr[i]=k;
a=a/10;
}


for(i=0;i<3;i++){
k=b%10;
arr2[i]=k;
b=b/10;
}


for(i=0;i<3;i++){
k=c%10;
arr3[i]=k;
c=c/10;
}


k=0;

for(i=2;i>=0;i--){
min=100;

if(arr[i]>max)
max=arr[i];
if(arr2[i]>max)
max=arr2[i];
if(arr3[i]>max)
max=arr3[i];

if(arr[i]<min)
min=arr[i];
if(arr2[i]<min)
min=arr2[i];
if(arr3[i]<min)
min=arr3[i];


k=k*10+min;
}

k=max*1000+k;
System.out.print(k);

}
}