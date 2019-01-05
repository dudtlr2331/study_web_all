package step03;

public class Coffee {
	String name;
	int price;
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String info() {
		return "이름 : " + name +" , 가격 : " + price;
	}
	
	
	
	public void printInfo() {
		System.out.println("이름 : " + name+ " , 가격 : " + price);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		if(price > 4100) {
			System.out.println("너무 비싸");
			this.price = 4100;
		}else {
			this.price = price;
		}
	}
}
