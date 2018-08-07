import java.util.*;

class bank{
int tra=0,tk=0;

int trans1(int acc,int avail,int money){
{
tra=money+avail;
System.out.println("Acc no. "+acc+" Available balance "+tra);
return tra;
}
}
int trans2(int acc,int avail,int money){
tk= avail-money;

if(tk<500)
{
System.out.println("Acc no. "+acc+" Your balance is less than 500");
return avail;
}
else
{
System.out.println("Acc no. "+acc+" Available balance: "+tk);
return tk;
}
}


public static void main(String arr[]){
bank b= new bank();
int avail,acc;

Scanner s= new Scanner(System.in);
System.out.println("Enter the account number");
acc=s.nextInt();
System.out.println("Enter the available balance");
avail=s.nextInt();

if(avail>=500){
System.out.println("Enter 1 to insert money OR Enter 2 to transact money OR Enter 3 to exit");
int x= s.nextInt(),money=0;
int ka=avail;

while(x!=3){

if(x==1){
System.out.println("How much money do you want to deposit ?");
money= s.nextInt();
ka=b.trans1(acc,avail,money);
avail=ka;
}


else if(x==2){
System.out.println("How much to transact ?");

money= s.nextInt();

ka=b.trans2(acc,avail,money);
avail=ka;
}


else if(x==3){
break;
}
System.out.println("Enter 1 to insert money OR Enter 2 to transact money OR Enter 3 to exit");
x= s.nextInt();
}
System.out.println("Thanks for transacting with us");
}
else{
System.out.println("Not enough balance");
}
}
}