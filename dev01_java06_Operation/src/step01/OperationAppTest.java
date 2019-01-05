package step01;

public class OperationAppTest {
	public static void main(String[] args) {
		// 1.값비교
		int a = 1;
		int b = 1;
		System.out.println(a == b);
		
		long aa = 1L;
		int bb = 1;
		
		//int, long, short = > 정수형
		//double, float = > 실수형
		System.out.println(aa == bb);// 둘다 정수로 변환되고 계산한다.
		
		//2. 객체비교
		Member m1 = new Member();
		Member m2 = new Member();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1 == m2); //객체비교
		System.out.println(m1.toString() == m2.toString()); //문자열 비교
		
		//3. 문자열 비교
		String s1 = new String("a");
		//String s1 = a;
		String s2 = new String("a");
		//String s2 = a;
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
	}
}
class Member{
	public String toString() {
		return "hi";
	}
}
