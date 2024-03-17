package oop.PhoneCircleMatrix;

public class Phone {
	private String number;
	private String model;
	private double weight;
	
	public void recieveCall(String name) {
		System.out.println("Звонит " + name);
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public Phone(String number, String model, double weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;
	}
	
	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}
			
	public Phone() {
		
	}
	
	public void recieveCall(String name, String number) {
		
	}
	
	public void sendMessage() {
		String[] numbersArray = {"88005553535",
								 "81234567890",
								 "11111111111"};
		for (String number: numbersArray) {
			System.out.println(number);
		}
	}
	
	public String toString() {
		System.out.println(getNumber() + " " + getModel() + " " + getWeight());
		return "";
	}
}