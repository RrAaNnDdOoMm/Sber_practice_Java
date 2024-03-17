package oop.paint;

public class Triangle extends Figure implements Drawable {
	private double width = 1;
	
	public Triangle(Point point, double width) {
		super(point);
		this.width = width;
	}
	
	@Override
	public double area() {
		return width*width/2;
	}

	@Override
	public double perimeter() {
		return width*(1+2*Math.sqrt(1.25));
	}
	
	public void draw() {
		System.out.println("Нарисован треугольник, цвет BLACK, координаты " + point.getX() + " " + point.getY());
	}
	
	public void draw(Color color) {
		System.out.println("Нарисован треугольник, цвет " + color + ", координаты " + point.getX() + " " + point.getY());
	}
}
