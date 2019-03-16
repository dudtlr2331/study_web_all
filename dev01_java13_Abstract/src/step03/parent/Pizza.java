package step03.parent;

public abstract class Pizza {

	public void delivery() {
		System.out.println(makePizza() + "를 배달한다...");
	}
	
	protected abstract String makePizza();
}
