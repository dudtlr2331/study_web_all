package step01;

/**
 * Abstract 추상화
 */
public abstract class Animal {
	public void say() {
		System.out.println(crying());
	}
	public abstract String crying();
}

class Cat extends Animal{
	@Override
	public String crying() {
		return "야옹";
	}
}

class Dog extends Animal{
	@Override
	public String crying() {
		return "멍멍";
	}
}

class Man extends Animal{
	@Override
	public String crying() {
		return "엉엉";
	}
}