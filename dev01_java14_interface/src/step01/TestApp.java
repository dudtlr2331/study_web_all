package step01;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 02. 21.
 * Interface -
 * 인터페이스는 interface 라는 키워드로 선언한다
 * 인터페이스의 변수는 상수(public static final) 이다.(public static final 생략 가능)
 * 인터페이스의 메서드는 추상메서드(abstract) 이다.(abstract 생략 가능)
 * 인터페이스로는 객체생성을 할 수 없다.
 * 인터페이스는 구현하는 객체는 implements라는 키워드를 사용한다.
 * 인터페이스는 extends로 인터페이스를 상속 할수 있다.
 * 인터페이스 맴버의 접근 지정자는 무조건 public 이다.
 * 인터페이스는 다중 상속이 가능하다. 
 */
public class TestApp {
	public static void main(String[] args) {
		BasicInterface.c();
	}
}

interface BasicInterface{
	//변수, 메서드
	String str = "1"; // public static final 
//	protected int int1 = 0;
//	private boolean bool = true;
	
	public abstract void a();
	void b(); //public abstract 
//	protected abstract void c();
//	private abstract void d();

	//구현부는 갖을수 없다. => 자식객체에서 구현 가능.
//	public void c() {
//		System.out.println("111");
//	}
	//구현부를 갖으려면 static을 붙이자.
	public static void c() {
		System.out.println("111");
	}
	
}

abstract class A{
	abstract void a();
	abstract void b();
	abstract void c();
	abstract void d();
	abstract void e();
}
interface B{
	abstract void a();
	abstract void b();
	abstract void c();
	abstract void d();
	abstract void e();
}

//interface는 implements를 사용해서 구현한다.
class BasicClass implements BasicInterface{

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}
	
}

interface Fly{
	void fly();
}
interface Bim{
	void bim();
}

//class a extends A, B
class SuperMan implements Fly, Bim{
	@Override
	public void bim() {
		
	}
	@Override
	public void fly() {
		
	}
}

interface 뿔{
	public void 뿔로찌르기();
}
interface 악마 extends 뿔{}
//implements는 추상메서드를 구현하는 키워드. 그래서 인터페이스는 extends로 상속을 받아야 한다.
//interface 악마 implements 뿔{}


interface 철수{}
interface 영희{}
interface 학교 extends 철수, 영희{};
//class 학교 implements 철수, 영희{};