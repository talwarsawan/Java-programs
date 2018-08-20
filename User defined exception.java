import java.util.*;

class cla extends Exception{

cla(String ar){
super(ar);
}
	
public static void main(String arr[]){

try{
int a;
Scanner sc= new Scanner(System.in);
a=sc.nextInt();

if(a>0){
cla obj= new cla("The number is greater than 0!");
throw obj;
}

}
catch(cla e){
e.printStackTrace();
}

}
}