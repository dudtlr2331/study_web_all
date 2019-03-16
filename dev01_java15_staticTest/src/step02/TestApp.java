package step02;


/*
 * static은 static끼리 통한다를 증명하는 예제.
 */
public class TestApp {
	int i = 10; //filed, member V
	static int j = 20; //static V, class V
	
	//static에서는 non-static 사용 불가 (예외 객체생성하면 가능)
	//non-static에서는 static 사용 가능
	//this는 static에서 사용 불가
	public static void test1() {
		TestApp t = new TestApp();
		//멤버 변수
		System.out.println("member V :: " + t.i);
		
		//스태틱 변수
		System.out.println("member V :: " + j);
		System.out.println("member V :: " + TestApp.j);
	}
	
	public static void main(String[] args) {
		TestApp.test1();
	}

}
