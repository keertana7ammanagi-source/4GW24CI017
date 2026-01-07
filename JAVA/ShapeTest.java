package com.javastudy;

abstract class Shape1{
	abstract void area();
	abstract void perimeter();
}

class Circle extends Shape1{
	double r;
	Circle(double radius){
		r=radius;
	}
	void area() {
		System.out.println("Area of circle: "+ (3.14*r*r));
	}
	void perimeter() {
		System.out.println("Perimetere of circle:" + (2*3.14*r));
	}
	
}
class Triangle extends Shape1{
	double a,b,c;
	Triangle(double x, double y, double z){
		a=x;
		b=y;
		c=z;
	}
	void area() {
		double s = (a+b+c)/2;
		double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle: " + ar);
	}
	void perimeter() {
		System.out.println("Perimeter of Triangle: " + (a+b+c));
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.area();
		c.perimeter();
		System.out.println();
		Triangle t = new Triangle(3,4,5);
		t.area();
		t.perimeter();

	}

}
