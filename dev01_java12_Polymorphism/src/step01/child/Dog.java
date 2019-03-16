package step01.child;

import step01.parent.Animal;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("머리 박고 얌얌..");
	}
}
