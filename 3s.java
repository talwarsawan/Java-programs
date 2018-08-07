import java.util.*;

class author{
private String name;
private String email;
private char gender;

author(String na, String em, char ge){
name=na;
email=em;
gender=ge;
}

public String getName(){
return name;
}

public String getEmail(){
return email;
}

public void setEmail(String a){
email=a;
}

public char getGender(){
return gender;
}

public String toString(){
String n=" Author "+name+" Email "+email+" Gender "+gender;
return n;
}

public static void main(String arr[]){

author a= new author("Sawan","Email",'M');
a.getName();
a.getEmail();
a.setEmail("Em");
a.getGender();
System.out.println(a.toString());

}
}

class book{
private String name;
private double price;
private int qty=0;
author thor;

book(String nam, author auth, double pri){
name=nam;
thor=auth;
price=pri;
}

book(String na, author au, double pr, int qt){
name=na;
thor=au;
price=pr;
qty=qt;
}

public String getName(){
return name;
}

author getAuthor(){
return thor;
}

public double getPrice(){
return price;
}

public void setPrice(double p){
price=p;
}

public int getQty(){
return qty;
}

public void setQty(int q){
qty=q;
}

public String toString(){
String n="Book "+name+" author "+thor+" Price "+price+" Quantity "+qty;
return n;
}

public static void main(String arr[]){
author th= new author("Sawan","Email",'M');

book b= new book("Me",th,12.15);
book k= new book("My",th,10.5);
b.getName();
b.getAuthor();
b.getPrice();
b.setPrice(101.5);
b.getQty();
b.setQty(5);
System.out.println(b.toString());
}
}
