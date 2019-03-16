package step02;

public abstract class CalCul {
	public void calcul(int a, int b) {
		//메서드 호출...
		System.out.println(doIt(a,b));
		
	}
	protected abstract double doIt(int a, int b);
}
