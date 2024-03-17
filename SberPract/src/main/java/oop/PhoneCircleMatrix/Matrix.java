package oop.PhoneCircleMatrix;

public class Matrix {
	final private int rowsNumber = 2;
	final private int columnsNumber = 2;
	private int[][] matrix = new int[rowsNumber][columnsNumber];
	
	public Matrix(int... args) {
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				if (args.length != 0) {
					this.matrix[row][column] = args[row*columnsNumber + column];
				} else {
					this.matrix[row][column] = 0;
				}
			}
		}
	}
	
	public void setValue(int i, int j, int value) {
		this.matrix[i][j] = value;
	}
	
	public int getValue(int i, int j) {
		return this.matrix[i][j];
	}
	
	public String toString() {
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				System.out.print(this.matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return "";
	}
	
	public void add(Matrix B) {
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				this.matrix[row][column] = this.matrix[row][column] + B.getValue(row, column);
			}
		}
	}
	
	public void scalMult(int x) {
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				this.matrix[row][column] = this.matrix[row][column] * x;
			}
		}
	}
	
	public void matMult(Matrix B) {
		Matrix C = new Matrix();
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				for (int i = 0; i < rowsNumber; i++) {
					C.setValue(row, column, C.getValue(row, column) + this.matrix[row][i] * B.getValue(i, column));
				}
			}
		}
		
		for (int row = 0; row < rowsNumber; row++) {
			for (int column = 0; column < columnsNumber; column++) {
				this.matrix[row][column] = C.getValue(row, column);
			}
		}
	}
}
