package step03;

public class TestApp {
	//같은 패키지 안에는 import가 필요없다.
//	public static void main(String[] args) {
//		Coffee c01 = new Coffee();
//		System.out.println(c01.name);
//		System.out.println(c01.price);
//	// 아메리카노 / 4100 데이터 넣어서 출력.
//		c01.name = "아메리카노";
//		c01.price = 4100;
//		System.out.println(c01.name);
//		System.out.println(c01.price);
//	}
//	//메서드 리팩토링
//	public static void main(String[] args) {
//		Coffee c01 = new Coffee();
//		c01.printInfo();
//		c01.name = "아메리카노";
//		c01.price = 4100;
//		c01.printInfo();
//	}
	// 데이터 캡슐화.
//	public static void main(String[] args) {
//		Coffee c01 = new Coffee();
//		c01.printInfo();
//		//c01.name = "아메리카노";
//		//c01.price = 4100;
//		//보안상 좋다.
//		c01.setName("아메리카노");
//		c01.setPrice(4100);
//		c01.printInfo();
//	}
	
	//스타벅스 셋팅
//	public static void main(String[] args) {
//		//이름 : 범박점.
//		Starbucks b01 = new Starbucks();
//		b01.setLocation("범박점");
//		//이름 : 범박점, 커피 : null
//		System.out.println(b01.toString());
//	}
	public static void main(String[] args) {
		Coffee co01 = new Coffee("아메리카노", 4100);
		Starbucks b01 = new Starbucks("범박점", co01);
		// 이름 : 아메리카노, 가격: 4100
		System.out.println(co01.info());
		//로케이션 : 범박점, 커피[ 이름 : 아메리카노, 가격: 4100 ]
		System.out.println(b01.info());
	}
}
