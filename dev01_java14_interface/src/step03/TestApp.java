package step03;

import step03.after.Cat;
import step03.after.Dog;
import step03.after.Man;

/**
 * 인터페이스의 추상화에 대한 예제.
 */
public class TestApp {
	public static void main(String[] args) {
		//동물 울음소리를 호출하는 프로그램.
		step03.before.ActionService service = new step03.before.ActionService(); 
		service.doAction("cat"); //야옹.. :: cry();
		service.doAction("man"); //엉엉.. :: say(); 
		service.doAction("dog"); //멍멍.. :: bite(); 
		
		//1. 메서드 표준화가 안되어있다.
		//2. 구상객체 추가시 서비스로직이 바뀐다.
		step03.after.ActionService service2 = new step03.after.ActionService();
		service2.doAction(new Cat());
		service2.doAction(new Man());
		service2.doAction(new Dog());
	}
}