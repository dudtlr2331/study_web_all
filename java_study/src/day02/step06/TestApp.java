package day02.step06;

import step02.Person;

public class TestApp {

	public static void main(String[] args) {
		
		Engine en1 = new Engine("eng1" , 1000);
		Car car1 = new Car("car1" , 2000 , en1);
		System.out.println(car1.toString());
	}

}
