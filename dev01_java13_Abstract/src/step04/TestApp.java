package step04;

/*
 * Modifier
 * 1) access Modifier (접근지정자)
 * - private < (default) < protected < public
 * 2) Usage Modifier (키워드)
 * - abstract, static, final, 등...
 * 
 * Abstract class(추상클래스) ::
 * Abstract method (추상 메서드)를 1개 이상 갖고 있는 클래스.
 * 완벽하지 않는 클래스(바로 객체생성 불가) 추상 메서드를 구현 해야지만 객체생성 가능.
 * 추상 메서드는 일종의 Template 역할을 하는데 추상클래스는 상속받은 자식들이 부모의
 * 추상메서드를 자식에 맞게 오버라이딩 해서 사용하도록 만드는 것이 목적.
 * 
 * 구현 방법
 * 1. 추상메서드 : 접근지정자 abstract 리턴타입  메서드명(인자..);
 * 예) public abstract String delivery(int price);
 * 2. 추상메서드를 가진 클래스 선언부 앞에는 반드시 abstract 키워드를 써줘야함.
 * 예) abstract class pizza{
 * 3. abstract class는 완벽한 클래스(설계도)가 아니기 때문에 객체 생성의 대상에서 제외.
 * 4. abstract class를 상속받은 자식을 생성할 때 Type으로서 사용된다.
 * pizza라는 부모객체(추상클래스)에 potatoPizza라는 자식 객체를 담는 것을 말한다.
 * 5. 추상클래스를 받는 자식객체도 추상클래스가 될 수 있다. 그렇게 되면 자식객체를 받는
 * 자식의 자식객체에서 추상메서드를 구현해줘야한다.
 * 
 */
public class TestApp {
	public static void main(String[] args) {
		//추상클래스는 객체생성을 바로 할수 없다.
		//왜냐하면 추상메서드를 구현을 안 했기 때문에..
		//		Pizza p1 = new Pizza(10000);
		//추상 메서드를 구현하면 객체생성 가능.
		Pizza p1 = new Pizza(10000) {
			protected String getName() {
				return "게살몽땅피자";
			}
		};
		//구상(구현)객체는 완벽한 객체로 모든 멤버를 사용가능.
		p1.howMuch();
		p1.delivery();
		p1.getName();
	}
}
//완벽한 클래스...
abstract class Pizza{
	//필드...
	int price;
	//생성자..
	Pizza(int price){
		this.price = price;
	}
	//메서드..
	public void howMuch() {
		System.out.println(this.price + "입니다.");
	}
	public void delivery() {
		System.out.println(getName() + "을 배달한다.");
	}
	//추상 메서드는 몸체가 없다. 자식 클래스에서 구현 해줘야함...
	protected abstract String getName();
}
//추상메서드를 상속하고 다시 추상메서드를 써주는 것도 가능.
//HalfPizza를 상속하는 자식 객체에서 구현해야됨.
abstract class HalfPizza extends Pizza{
	HalfPizza(int price){
		super(price);
	}
	
	@Override
	protected abstract String getName();
	
}