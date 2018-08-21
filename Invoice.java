 import java.util.Scanner;
class Invoice
{
	String number;
	String description;
	int quantity;
	double price;
	double amount;
	
Invoice(String number,String description,int quantity,double price)
{
	this.number=number;
	this.description=description;
	this.quantity=quantity;
	this.price=price;
}


public double getInvoice()
{
	amount=quantity*price;
	return amount;
}
}
class invoiceTest
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String number=sc.nextLine();
	String description=sc.nextLine();
	int quantity=sc.nextInt();
	double price=sc.nextDouble();

	if(quantity<0)
	quantity=0;

	if(price<0)
	price=0.0;

	Invoice i=new Invoice(number,description,quantity,price);
	double amt=i.getInvoice();
	System.out.println(amt);
}
}



