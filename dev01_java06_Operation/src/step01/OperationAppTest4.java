package step01;

public class OperationAppTest4 {
	public static void main(String[] args) {
		Operator o = new Operator();
		System.out.println("=============연산자 || =============");
		System.out.println(o.test1() || o.test2());
		System.out.println("=============연산자 && =============");
		System.out.println(o.test1() && o.test2());
		/*
		 =============연산자 || =============
		 test1() calling...
		 true
		 =============연산자 && =============
		 test1() calling...
		 test2() calling...
		 false
		 */
		
	}
}

class Operator{
	public boolean test1() {
		System.out.println("test1() calling...");
		return true;
	}
	public boolean test2() {
		System.out.println("test2() calling...");
		return false;
	}
}