package step01.child;

import step01.parent.Animal;

public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("핥아 먹는다...");
	}
}
