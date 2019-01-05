package day01.step03;

public class Hero {
	String name;
	int atPoint = 50;
	
	//생성자(메서드) : 객체생성될때 단 한번.
	Hero(String name){
		this.name = name;
//	System.out.println(
//			this.name + 
//			"의 공격력"
//				+ this.atPoint);
	}
	Hero(String name, int atPoint){
		this.name = name;
		if(atPoint > 50) {
			this.atPoint = atPoint;
		}
	}
}
