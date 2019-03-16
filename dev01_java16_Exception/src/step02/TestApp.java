package step02;

/**
 * 자바에서는 에러를 2가지로 나눈다.
 * 1.error => 프로그램에서조차 처리 할수 없는 오류
 * 	1) StacoverflowError
 *  2) OutofMemoryError
 * 2.exception => 프로그램에서 처리할수 있는 오류
 *  1) NullPointerException
 *  2) ClassNotFoundException
 *  3) ArrayIndexOutOfBoundException
 *  
 *  						Object
 *  						  |
 *  					  Throwable
 *  						  |
 *  		Exception						Error
 *  			|
 *   RuntimeException, ClassNotFoundException.....
 *  
 *  Exception 종류 
 *  1.RuntimeException
 *  2.CompileException
 *  
 */
import java.lang.NullPointerException;

public class TestApp {
	public static void main(String[] args) {
		runtimeException1();
		runtimeException2();
	}
	
	public static void runtimeException1() {
		System.out.println("NullPointerException.....");
		String str = new String("성영식");
		str = null;
		try {
			System.out.println("문자길이 :: " + str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생!!");
		}
	}
	
	public static void runtimeException2() {
		System.out.println("ArithmeticException.....");
		int i=0;
		int j=10;
		try {
			System.out.println(j/i);			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생!!");
		}
	}
}