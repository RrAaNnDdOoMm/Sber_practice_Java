package oop.paint;

public class Circle extends Figure implements Drawable {
	private double radius = 1;
	
	public Circle(Point point) {
		super(point);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	
	public void draw() {
		System.out.println("Нарисован круг, цвет BLACK, координаты " + point.getX() + " " + point.getY());
	}
	
	public void draw(Color color) {
		System.out.println("Нарисован круг, цвет " + color + ", координаты " + point.getX() + " " + point.getY());
	}
	
}