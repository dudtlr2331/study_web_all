package step01;

/**
 * Method over loading
 * 같은 이름의 메서드,생성자를 어려번 만드는 것.
 * 
 * Method Overloading Rule : 
 * 1. 하나의 클래스에서 적용 
 * 2. 메소드 이름은 반드시 일치 
 * 3. 메소드 argument List는 반드시 달라야함 (인자값의 순서, 갯수, 타입중 하나라도 달라야함) 
 * eg) 
 *  void round(String j, int i )
 *  Type round(int i, int j ) // int를 똑같이 인식하여 오류뜸 
 * 4. 리턴 타입은 상관없다.
 */
public class Person {
	public void drink() {
		System.out.println("마신다.");
	}
	public void beerDrink() {
		System.out.println("맥주를 마신다.");
	}
	public void beerTwoDrink() {
		System.out.println("맥주를 2잔 마신다.");
	}
	public void whoWithTwoDrink() {
		System.out.println("맥주를 영식이와 2잔 마신다.");
	}
	// => Over loading 기법 적용.
	public void drink(String kind) {
		System.out.println(kind +"를 마신다.");
	}
	public void drink(String kind, int cnt) {
		System.out.println(kind + "를 " + cnt +"잔 마신다.");
	}
	public void dring(String kind, int cnt, String who) {
		System.out.println(kind + "를 "+ who + "와 " + cnt +"잔 마신다.");
	}
}