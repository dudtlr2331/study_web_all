package step03;

/**
 * Member V와 Class V의 차이점을 구분할수 있는 로직
 * Class V가 생성된 객체들이 공유한다는 의미를 다뤄보겠다.
 */
class Member{
	int count;
	Member(){
		count++;
	}
}
class Goods{
	static int count;
	Goods(){
		count++;
	}
}
public class TestApp {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println(m1.count);	//1
		System.out.println(m2.count);	//1
		System.out.println(m3.count);	//1
		System.out.println(g1.count);	//3
		System.out.println(g2.count);	//3
		System.out.println(g3.count);	//3
		
	}
}