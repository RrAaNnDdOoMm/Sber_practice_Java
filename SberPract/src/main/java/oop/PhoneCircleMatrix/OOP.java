package oop.PhoneCircleMatrix;

public class OOP {
	public static void main(String[] args) {
		System.out.println("Телефон");
		Phone phone0 = new Phone();
		phone0.toString();
		Phone phone2 = new Phone("number2", "model2");
		phone2.toString();
		Phone phone3 = new Phone("number3", "model3", 6.9);
		phone3.toString();
		phone3.recieveCall("name3", "number3");
		phone3.sendMessage();
		
		
		System.out.println();
		System.out.println("Круг");
		Circle circle = new Circle(10, 256);
		circle.toString();
		
		
		System.out.println();
		System.out.println("Матрица");
		Matrix matrix1 = new Matrix(1, 2, 3, 4);
		Matrix matrix2 = new Matrix(1, 1, 1, 1);
		
		matrix1.add(matrix2);
		matrix1.toString(); //сложение
		
		matrix1.scalMult(2);
		matrix1.toString(); //умножение на скаляр
		
		matrix1.matMult(matrix2);
		matrix1.toString(); //умножение на матрицу
	}
}