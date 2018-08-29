import java.util.*;

class a{
public static void main(String ar[]){
String a;
int len,i,k,j,l;
char[] arr1= new char[20];
String[] arr2 = new String[20];

Scanner s= new Scanner(System.in);
a=s.next();
len=a.length();

for(i=0;i<len;i++){
arr1[i]=a.charAt(i);
}

if(len%2==0){
k=len/2-1;
l=k+1;
}
else{
k=len/2-1;
l=k+2;
arr1[k+1]=0;
}

for(i=0;i<=k;i++)
for(j=l;j<len;j++){
if(arr1[i]==arr1[j]){
arr1[i]=0;
arr1[j]=0;
}
}

for(i=0;i<len;i++){
if(arr1[i]!=0){
k=-1;
break;
}
}

if(k==-1){
System.out.println("Not anagram");
}
else{
System.out.println("Anagram");
}
}
}