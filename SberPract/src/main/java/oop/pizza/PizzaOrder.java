package oop.pizza;

public class PizzaOrder {
	private String name;
	private Size size;
	private boolean isSauceRequired;
	private String adress;
	private boolean isOrderAccepted;
	
	private String sizeStr;
	private String sauceStr;
	
	public PizzaOrder(String name, Size size, boolean isSauceRequired, String adress) {
		this.setName(name);
		this.size = size;
		this.isSauceRequired = isSauceRequired;
		this.adress = adress;
	}
	
	public void order() {
		if (this.isSauceRequired) {
			sauceStr = "с соусом";
		} else {
			sauceStr = "без соуса";
		}
		
		switch (this.size) {
		case SMALL:
			sizeStr = "Маленькая";
			break;
		case MEDIUM:
			sizeStr = "Средняя";
			break;
		case BIG:
			sizeStr = "Большая";
			break;
		}
		
		System.out.println("Заказ принят. " + sizeStr + " пицца «" + name + "» " + sauceStr + " на адрес " + adress);
	}
	
	public void cancel() {
		System.out.println("Заказ отменён.");
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	
	
	public boolean getSauce() {
		return isSauceRequired;
	}
	public void setSauce(boolean sauce) {
		this.isSauceRequired = sauce;
	}
	
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.name = adress;
	}
	
	public String toString() {
		System.out.println("Имя: " + name + ". Размер: " + size + ". Соус: "+ isSauceRequired + ". Адрес: " + adress);
		return "";
	}
}
