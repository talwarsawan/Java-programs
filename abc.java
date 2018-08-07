import java.util.*;
class test{
public static void main(String arr[]){
Random ran= new Random();
int q=ran.nextInt(26),k=q+97,c=0;
char j=(char)k;
if(j=='a' || j=='b' ||j=='c')c=2;
else if(j=='d' || j=='e' || j=='f')c=3;
else if(j=='g' || j=='h' || j=='i')c=4;
else if(j=='j' || j=='k' || j=='l')c=5;
else if(j=='m' || j=='n' ||j=='o')c=6;
else if(j=='p' || j=='q' || j=='r' || j=='s')c=7;
else if(j=='t' || j=='u' || j=='v')c=8;
else if(j=='w' || j=='x' || j=='y'|| j=='z')c=9;
System.out.println(q+"\n"+j+"\n"+c);
}}