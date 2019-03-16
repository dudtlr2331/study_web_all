package step01.child;

import step01.parent.Animal;

public class Man extends Animal{
	public boolean jooryang;
	
	@Override
	public void eat() {
		System.out.println("수저로 얌얌..");
	}
	
	@Override
	public String sleep(int hour) {
		return "침대 위에서 쿨쿨쿨...";
	}
	
	public void drive() {
		System.out.println(jooryang + " : : 승용차로 운전해서 출근...");
	}
}
