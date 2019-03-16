package step03;

public class TestApp {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.name = "성영식";
		
		Man man2 = new SuperMan();
		man2.name = "김새봄";
		
		Man man3 = new Man();
		man3.name = "김준성";
		
		//1번방법 캐스팅
		((SuperMan)man2).flying();
		//2번방법 캐스팅
		SuperMan superMan = (SuperMan)man2;
		superMan.flying();

		//얘는 안된다..... 원래가 Man인 객체.. 상속이 안돼서
		((SuperMan)man3).flying();
	}
}

// 맴버 : 2
class Man{
	String name;
	public String getName() {
		return this.name;
	}
}

// 맴버 : 3
class SuperMan extends Man{
	public void flying() {
		System.out.println("날다~");
	}
}