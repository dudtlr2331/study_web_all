package step01;

public class JavaBasicTest {
	/* 여러줄 주석 */
	/*
	 * 여러줄 주석
	 */
	/**
	 * document 주석
	 * @param args
	 */
	//main 메서드 => JVM이 실행될 때 제일 먼저 찾는 메서드.
	public static void main(String[] args) {
		//chapter01 - 기본 출력 예제
		//chapter01();
		//chapter02 - 변수 선언과 할당.
		//chapter02();		
		//chapter03 - 변수의 기본형과 참조형
		//chapter03();
		
		
	}

	private static void chapter03() {
		/*
		 변수에는 참조형과 기본형이 있다.
		 기본형
		 문자형 : char
		 숫자형 : short, int, double, long, float, byte
		 논리형 : boolean
		 참조형
		 8개를 제외한 모든것
		 */
		int a = 1; //숫자의 기본형 0
	}

	//메서드 분리
	private static void chapter02() {
		/*
		 변수 선언 방법.
		 - 선언
		 접근지정자 타입 변수명;
		 - 할당
		 변수명  = 값;
		 
		 접근지정자
		 1. private : 클래스에서만 공개
		 2. (default) : 패키지에서만 공개
		 3. protected : 상속된 클래스에서만 공개
		 4. public : 모두 공개
		 
		 
		 
		 */
		
		
		//변수 선언
		String name; // 선언
		name = "김준성"; //할당
		int age = 23; //선언과 동시에 초기화
		System.out.println(name + " : " + age);
	}

	private static void chapter01() {
		//출력하는 메서드.
		System.out.println("안녕");
		System.out.println(1); //int 형
		System.out.println("1"); //string 형
		System.out.println("1+1 : "+ (1+1));//2
		System.out.println("1"+"1"); //11
		System.out.println("1"+1); //11=> 문자형 + 숫자형 => 문자형
	}
}
