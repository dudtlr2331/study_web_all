package step01;

public class TestApp {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Man();
		
		Animal a4 = new Animal() {
			@Override
			public String crying() {
				return "ㅠㅠ";
			}
		};
		
		a1.say();
		a2.say();
		a3.say();
		a4.say();
	}
}