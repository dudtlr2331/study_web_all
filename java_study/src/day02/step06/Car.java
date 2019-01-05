package day02.step06;

public class Car {
	protected String name;
	protected int price;
	protected Engine engine;

	Car(String name , int price ,Engine engine){
		this.name = name;
		this.price = price;
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
