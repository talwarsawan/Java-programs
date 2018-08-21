import java.util.*;

class stud{
public static void main(String ar[]){
	int a,i;
	
	int[] arr= new int[20];
	int[] arr2= new int[20];
	
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
	
	for(i=0;i<a;i++){
		arr2[i]=0;
	}
	
	for(i=0;i<a;i++){
		arr[i]=s.nextInt();
		
		if(arr2[arr[i]]>0){
			System.out.print("0");
		}
		else{
			arr2[arr[i]]++;
			System.out.print(arr[i]);
		}
	}
}
}