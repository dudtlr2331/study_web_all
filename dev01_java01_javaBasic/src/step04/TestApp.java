package step04;

public class TestApp {

	public static void main(String[] args) {
		// 1.변수 선언
		Woman w01 = null;
		// 2. 객체생성해서 변수에 담기
		w01 = new Woman();
		
		System.out.println(w01);
		System.out.println(w01.name);
		System.out.println(w01.age);
		System.out.println(w01.marraied);

	}

}
