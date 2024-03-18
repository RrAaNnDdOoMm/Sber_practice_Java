package oop.paint;

public abstract class Figure {
	public Figure(Point point) {
		this.point = point;
	}
	
	protected Point point;
	
	public abstract double area();
	
	public abstract double perimeter();
}
