package step03.child;

import step03.parent.Parent;

/**
 * 맴버 : 4개??? => 2개
 */
public class Child extends Parent{
	
	public Child() {
		super();
		System.out.println("Child Create!!!");
	}

	public void printTest() {
		System.out.println(publicTest);
		System.out.println(protectedTest);
//		System.out.println(defaultTest);
//		System.out.println(privateTest);
	}
	
	@Override
	public void access() {
		System.out.println("Child!!!");
	}
}