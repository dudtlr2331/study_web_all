package step02;

public class AppTest {
 public static void main(String[] args) {
	
	 //객체가 생성되고 나서 값을 주입
	 Baby 윤후1 = new Baby();
	 윤후1.setGender('M');
	 윤후1.setAge(0);
	 
	 //객체가 생성되자마자 값을 주입
	 Baby 윤후2 = new Baby('M', 0);
	
}
}
