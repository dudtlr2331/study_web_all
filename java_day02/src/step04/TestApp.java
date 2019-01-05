package step04;
/**
 * 상속 : inheritance
 * 모든 자바 클래스의 최고 조상은 Object
 */
public class TestApp {

	public static void main(String[] args) {
		Person person = new Person();
		Woman woman = new Woman();
		Man man = new Man();
		
		person.eat();
		woman.eat();
		man.eat();
	}

}
