package step03.test;

import step03.child.Child;

public class AccessTest {

	public static void main(String[] args) {
		Child c = new Child();  
		c.printTest();
		/*
		 * Parent Create!!!
		 * Child Create!!!
		 * publicTest
		 */
		c.access();
	}

}