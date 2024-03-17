package oop.book;

public class Main {
	public static void main(String[] args) {
		Author author = new Author("Имя", "Пол", "email");
		Book book = new Book("Название", author, 2024);
		author.toString();
		book.toString();
	}
}
