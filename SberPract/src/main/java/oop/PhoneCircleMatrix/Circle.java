package oop.PhoneCircleMatrix;

public class Circle {
	private double radius;
	private int color;

	public double area() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	
	public Circle(double radius, int color) {
		this.radius = radius;
		this.color = color;
	}
	
	public String toString() {
		System.out.println("Радиус: " + this.radius + ". Цвет: " + this.color + ". Площадь: " + area() + ". Периметр:" + perimeter());
		return "";
	}
}
