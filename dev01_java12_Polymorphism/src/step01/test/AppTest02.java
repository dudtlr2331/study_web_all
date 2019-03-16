package step01.test;

import step01.child.Cat;
import step01.child.Dog;
import step01.child.Man;
import step01.parent.Animal;

public class AppTest02 {
	public static void main(String[] args) {
		//폴리몰피즘으로 객체 3개 (고양이, 개, 사람)를 배열로 생성.
		Animal[] a = {
				new Cat(),
				new Dog(),
				new Man()
		};
		//for문을 돌리면서 객체 각자의 eat()를 출력하고 instanceof 를 사용해서 Man이면 drive()를 호출 하도록.
		for(int i = 0; i < a.length; i++) {
			a[i].eat();
			
			if(a[i] instanceof Man) {
				Man m1 = (Man) a[i];
				m1.drive();
			}
		}
	}
}
