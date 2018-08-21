import java.util.*;

class stud{
	public static void main(String ar[]){
	int a,i,l=-1025,s=1025;
	int[] arr= new int[20];
	
	Scanner s1= new Scanner(System.in);
	
	a=s1.nextInt();
	
	for(i=0;i<a;i++){
	arr[i]=s1.nextInt();
	
	if(arr[i]>l)
	{
		l=arr[i];
	}
	if(arr[i]<s){
		s=arr[i];
	}
	}
	
	System.out.println("Largest: "+l+" Smallest: "+s);
	}
}