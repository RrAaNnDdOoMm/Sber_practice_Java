package oop.paint;

public class PaintExample {
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(1);
		point.setY(1);
		Circle circle = new Circle(point);
		System.out.println("Площадь: " + circle.area());
		System.out.println("Периметр: " + circle.perimeter());
		circle.draw();
		circle.draw(Color.RED);
		System.out.println();
		
		point.setX(2);
		point.setY(2);
		Rectangle rectangle = new Rectangle(point, 2, 2);
		System.out.println("Площадь: " + rectangle.area());
		System.out.println("Периметр: " + rectangle.perimeter());
		rectangle.draw();
		rectangle.draw(Color.GREEN);
		System.out.println();
		
		point.setX(3);
		point.setY(3);
		Square square = new Square(point, 3);
		System.out.println("Площадь: " + square.area());
		System.out.println("Периметр: " + square.perimeter());
		square.draw();
		square.draw(Color.BLUE);
		System.out.println();
		
		point.setX(4);
		point.setY(4);
		Triangle triangle = new Triangle(point, 4);
		System.out.println("Площадь: " + triangle.area());
		System.out.println("Периметр: " + triangle.perimeter());
		triangle.draw();
		triangle.draw(Color.YELLOW);
		System.out.println();
	}
}