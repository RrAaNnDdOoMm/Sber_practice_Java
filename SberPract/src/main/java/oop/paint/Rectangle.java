package oop.paint;

public class Rectangle extends Figure implements Drawable {
	private double width = 1;
	private double height = 1;
	
	public Rectangle(Point point, double width, double height) {
		super(point);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width*height;
	}

	@Override
	public double perimeter() {
		return 2*(width + height);
	}
	
	public void draw() {
		System.out.println("Нарисован прямоугольник, цвет BLACK, координаты " + point.getX() + " " + point.getY());
	}
	
	public void draw(Color color) {
		System.out.println("Нарисован прямоугольник, цвет " + color + ", координаты " + point.getX() + " " + point.getY());
	}
}