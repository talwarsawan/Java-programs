import java.util.*;

class a2{
public static void main(String ar[]){
int n,k,i,d=0,odd=0,even=0,j;
int[] arr= new int[20];
int[] a= new int[20];

Scanner s= new Scanner(System.in);

System.out.println("Enter number");
n=s.nextInt();

while(n!=0){
k=n%10;
arr[d]=k;
n=n/10;
d++;
}

/*
for(i=d-1;i>=0;i--){
System.out.print(arr[i]+" ");
}
*/
for(i=0;i<d;i++){
a[i]=1;
for(j=i+1;j<d;j++){
if(arr[i]==arr[j]){
a[i]++;
arr[j]=-10;
}
}
if(a[i]%2==0 && arr[i]!=-10)
even++;
else if(a[i]%2!=0 && arr[i]!=-10)
odd++;
}

/*
System.out.println("\n");

for(i=0;i<d;i++){
System.out.print(arr[i]+" ");
}

System.out.println("\n");


for(i=0;i<d;i++){
System.out.print(a[i]+" ");
}
*/
if(odd>1){
	System.out.println("Not palindrome");
}
else{
	System.out.println("Palindrome");
}
}
}