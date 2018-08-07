import java.util.*;

class bank{
int tra;

int trans1(int acc,int avail,int money){
{
tra=money+avail;
System.out.println("Acc no. "+acc+" Available balance "+tra);
return tra;
}
}
int trans2(int acc,int avail,int money){
tra= avail-money;

if(tra<500)
{
System.out.println("Acc no. "+acc+" Your balance is less than 500");
}
else
{
System.out.println("Acc no. "+acc+" Available balance: "+tra);
}
return tra;
}


public static void main(String arr[]){
bank b= new bank();
int avail,acc;

Scanner s= new Scanner(System.in);
System.out.println("Enter the account number");
acc=s.nextInt();
System.out.println("Enter the available balance");
avail=s.nextInt();

if(avail>500){
System.out.println("Enter 1 to insert money OR Enter 2 to transact money OR Enter 3 to exit");
int x= s.nextInt(),money=0;
int ka=0;

while(x!=3){

if(x==1){
System.out.println("How much money do you want to deposit ?");
money= s.nextInt();
ka=b.trans1(acc,avail,money);
}
else if(x==2){
System.out.println("How much to transact ?");

money= s.nextInt();
money=money+ka;

ka=b.trans2(acc,avail,money);
}
else if(x==3){
break;
}
System.out.println("Enter 1 to insert money OR Enter 2 to transact money OR Enter 3 to exit");
x= s.nextInt();
money=money+ka;
}
System.out.println("Thanks for transacting with us");
}
else{
System.out.println("Not enough balance");
}
}
}