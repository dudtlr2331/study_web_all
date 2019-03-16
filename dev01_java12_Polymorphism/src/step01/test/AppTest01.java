package step01.test;

import step01.child.Cat;
import step01.child.Dog;
import step01.child.Man;
import step01.parent.Animal;

/**
 * Polymorphism(다형성)
 * 부모타입으로 여러개의 자식 객체를 생성하는 것을 말함.
 * 이렇게 객체를 생성할때 타입을 부모로 해서 만들게 되면
 * 부모 클래스의 기능으로 다양한 자식들을 공통적으로 관리.
 */
public class AppTest01 {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Man();
		
		a1.eat();
		a2.eat();
		a3.eat();
		
//		a3.drive();
		Man m1 = (Man) a3;
		m1.drive();
	}
}
