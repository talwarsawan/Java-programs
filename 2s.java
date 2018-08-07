import java.util.*;

class account{
private int accountNumber;
private double balance=0.0;

account(int an,double b){
accountNumber=an;
balance=b;
}

public int getAccountNumber(){
return accountNumber;
}

public double getbalance(){
return balance;
}

public void setBalance(double bal){
balance=bal;
}

public void credit(double credit){
balance = balance +credit;
}

public void debit(double amount){
if(balance>=amount){
balance = balance - amount;
}
else{
System.out.println("Sorry");
}


String toString(){
String n=accountNumber+balance;
return n;
}
}
}

public static void main(String arr[]){
account ac= new account(10,12.5);
ac.debit(5000);
System.out.println(ac.getAccountNumber());
System.out.println(ac.toString());
}

}