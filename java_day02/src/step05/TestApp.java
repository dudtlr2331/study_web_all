package step05;

public class TestApp {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(10);
		System.out.println(dog.getAge());
		
		Pizza pizza = new Pizza();
		pizza.setAge(10);
/*
 * 접근 지정자.
 * public - 전체 공개
 * (default) - 패키지 공개
 * protected - 상속 공개
 * private - 클래스 공개
 */
	}
}
class Animal{
	protected int age;
	
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
}

class Dog extends Animal{
	
}
class Pizza extends Animal{
	
}