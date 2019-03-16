package step05;
/*
 * static 블럭을 확인하는 예제
 */
class Car{
	static int price = 0;
	Car(){
		Car.price = 100;
		System.out.println("나는 생성자");
	}
	/*
	 * static은 static 블럭에서 초기화하자.
	 */
	static {
		Car.price = 50;
		System.out.println("나는 스테틱 블럭");
	}
	void method() {
		System.out.println("나는 메서드");
	}
}
public class TestApp {
	public static void main(String[] args) {
		Car car = new Car();
		car.method();
	}
}
