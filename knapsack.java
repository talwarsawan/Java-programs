import java.util.*;

class profit{
public static void main(String ar[]){
int[] arr=new int[20];
int[] profit= new int[20];
int[] profit2= new int[20];
int[] weight= new int[20];
int[] weight2= new int[20];
int[] ratio= new int[20];
int k,max,add=0,maxweight=-10,maxprofit=-10,i,j;

Scanner s= new Scanner(System.in);

System.out.println("Enter number of elements!");
k=s.nextInt();

System.out.println("Enter max weight");
max=s.nextInt();

for(i=0;i<k;i++){
System.out.println("Enter profit");
profit[i]=s.nextInt();
profit2[i]=profit[i];

System.out.println("Enter weight");
weight[i]=s.nextInt();
weight2[i]=weight[i];

ratio[i]=profit[i]/weight[i];
}
 
int temp;
for(i=0;i<k;i++){
for(j=i+1;j<k;j++){
if(profit[j]>profit[i]){

temp=profit[j];
profit[j]=profit[i];
profit[i]=temp;

temp=weight[j];
weight[j]=weight[i];
weight[i]=temp;

temp=ratio[j];
ratio[j]=ratio[i];
ratio[i]=temp;
}
}
}

int pr=0;

System.out.println("Profit on the basis of price");
for(i=0;i<k;i++){
if((max-add)>=weight[i]){
add=add+weight[i];
pr=pr+profit[i];
}

else
{
int ra=(max-add)*profit[i]/weight[i];
add=add+(max-add);
pr=pr+ra;
}

if(add>max)
break;
}
System.out.println(pr);


for(i=0;i<k;i++){
for(j=i+1;j<k;j++){
if(weight[i]>weight[j]){

temp=profit[j];
profit[j]=profit[i];
profit[i]=temp;

temp=weight[j];
weight[j]=weight[i];
weight[i]=temp;

temp=ratio[j];
ratio[j]=ratio[i];
ratio[i]=temp;
}
}
}

add=0;
pr=0;
System.out.println("Profit on the basis of weight");
for(i=0;i<k;i++){
if((max-add)>=weight[i]){
add=add+weight[i];
pr=pr+weight[i];
}

else
{
int ra=(max-add)*profit[i]/weight[i];
add=add+(max-add);
pr=pr+ra;
}

if(add>=max)
break;
}
System.out.println(pr);



for(i=0;i<k;i++){
for(j=i+1;j<k;j++){
if(ratio[j]>ratio[i]){

temp=profit[j];
profit[j]=profit[i];
profit[i]=temp;

temp=weight[j];
weight[j]=weight[i];
weight[i]=temp;

temp=ratio[j];
ratio[j]=ratio[i];
ratio[i]=temp;
}
}
}


pr=0;
add=0;
System.out.println("Profit on the basis of ratio");
for(i=0;i<k;i++){
if((max-add)>=weight[i]){
add=add+weight[i];
pr=pr+weight[i];
}

else
{
int ra=(max-add)*profit[i]/weight[i];
add=add+(max-add);
pr=pr+ra;
}

if(add>=max)
break;
}
System.out.println(pr);

}
}