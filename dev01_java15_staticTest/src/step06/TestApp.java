package step06;

/**
 * final ::: 내가 마지막이야.
 * static 키워드와 final이란 키워드는 자주 같이 쓰인다.
 * final 변수 => "내가 마지막 변수야~" ---> 상수를 의미
 * final 메서드 => "내가 마지막 메서드야~" ---> 오버라이딩 금지 의미
 * final 클래스 => "내가 마지막 클래스야~" ---> 상속 금지 의미
 * 
 * 상수
 * 수학에서의 상수 ::: 숫자... x + 1 => 1  => 리터럴
 * 프로그램에서 상수 ::: 변하지 않는 값.
 */
class A{
	//상수는 대문자로 띄어쓰기는 _로 한다
	static final int BASE_SALARY = 300; //상수 :: 변하지 않는 값.
	public final String test() {
		return "Overriding 금지";
	}
}
final class B{}

//파이널 클래스는 상속이 안된다.
//class C extends B{}

class D extends A{
//	public String test() {
//		return "다른로직으로 변경";
//	}
}
public class TestApp {
	public static void main(String[] args) {
		System.out.println(A.BASE_SALARY);
		A a = new A();
		System.out.println(a.BASE_SALARY);
		System.out.println(a.test());
		
		//파이널 변수는 변경이 안된다.
//		A.BASE_SALARY = 200;
		//파이널 메서드는 오버라이딩이 안된다..
		D d = new D();
		d.test();
		
	}
}