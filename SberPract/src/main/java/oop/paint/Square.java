package oop.paint;

public class Square extends Figure implements Drawable {
	private double width = 1;
	
	public Square(Point point, double width) {
		super(point);
		this.width = width;
	}
	
	@Override
	public double area() {
		return width*width;
	}

	@Override
	public double perimeter() {
		return 4*width;
	}
	
	public void draw() {
		System.out.println("Нарисован квадрат, цвет BLACK, координаты " + point.getX() + " " + point.getY());
	}
	
	public void draw(Color color) {
		System.out.println("Нарисован квадрат, цвет " + color + ", координаты " + point.getX() + " " + point.getY());
	}
}
