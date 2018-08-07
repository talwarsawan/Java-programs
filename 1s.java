import java.util.*;

class Circle{
private double radius;
private String color;

Circle(){
radius=1.0;
color="red";
}

Circle(double r){
this.radius=r;
}

public double getRadius(){
return this.radius;
}

public void getArea(){
double a=3.14*radius*radius;
System.out.println(a);
}

public static void main(String arr[]){
Circle cs= new Circle(10);

double k=cs.getRadius();
cs.getArea();
}


}