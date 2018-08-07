import java.util.*;

class rep{

public static void main(String acr[]){
Scanner s= new Scanner(System.in);

int[] arr = new int[200];
int i,j;

String a= s.nextLine();

for(i=0;i<a.length();i++){
for(j=65;j<122;j++){
if((int)(a.charAt(i))==j){
arr[j]++;
}
}
}

for(j=65;j<122;j++){
	if(arr[j]>0){
char k= (char)j;
	System.out.println(k+" "+arr[j]);

}}
}
}