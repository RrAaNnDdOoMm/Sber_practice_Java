package oop.pizza;

public class Main {
	public static void main(String[] args) {
		PizzaOrder pizza = new PizzaOrder("Баварская", Size.BIG, true, "Орлова 6");
		pizza.toString();
		pizza.order();
		pizza.cancel();
	}
}
