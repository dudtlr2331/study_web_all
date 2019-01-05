package step02;

public class MethodTest {
	
	public static void main(String[] args) {
//		Member m;
		Member m = null; //지역변수는 초기화를 해줘야한다.
		m = new Member(); //할당
//		m.print();
//		m.print("김준성");
		// 리턴값이 있는 스트링.
//		String str = m.printStr();
//		System.out.println(str);
//		System.out.println(m.printStr());
		//
		int result = m.sum(5, 4);
		System.out.println(result); // 9가 나와야함.
	}


}

class Member{
	//변수 => 클래스에 정보를 저장하는곳
	//메서드 => 클래스에 정보를 저장하기위해 행해지는 행위
	/*
	 선언방법
	 접근지정자 타입(없으면 void) 메서드명(파라미터 or 매개변수 or 인자값){
	 	//코드
	 	타입이 있으면 return 타입에해당되는반환값;
	 }
	 */
	public void print() {
		System.out.println("print를 호출하였습니다.");
	}
	
	String name = "tester";
	//파마리터의 타입 갯수 순서를 바구면 가능. => 메서드 오버로딩.
	public void print(String name) {
		System.out.println("지역변수 : " + name + "안녕하세요.");
		System.out.println("전역변수 : " + this.name + "안녕하세요.");
	}
	public void print(String name, int age) {
		System.out.println("print를 호출하였습니다.");
	}
	public void print(int age, String name) {
		System.out.println("print를 호출하였습니다.");
	}
	public void print(String name, String age) {
		System.out.println("print를 호출하였습니다.");
	}
//	public String printStr() {
//		return new String("hi");
//	}
	public String printStr() {
		String name = "KJS";
		String hi = new String("hi");
		return name + hi;
	}
	public int sum(int a, int b) {
		return a+b;
	}
}