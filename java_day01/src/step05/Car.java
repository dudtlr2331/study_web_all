package step05;

public class Car {
	private String name;
	private int price;
	private Engine engine;
	
	Car(String name , int price , Engine engine){
		this.name = name;
		this.price = price;
		this.engine =engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String toString () {
//		return this.getName() + " , " + this.getPrice();
//		return name + " , " + price;
		String result = "이름 : " + this.name + ", 가격 : " + this.price;
		return result;
		
		
	}
	
	public String getInfo() {
		return this.toString() + this.engine.toString();
	}
}