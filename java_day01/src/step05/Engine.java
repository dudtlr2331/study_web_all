package step05;

public class Engine {
	private String name;
	private int price;
	
	public String getName() {
		return this.name;
	}
	
	Engine(String name , int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString () {
		String result = "이름 : " + this.name + ", 가격 : " + this.price;
		return result;
	}
	
}
