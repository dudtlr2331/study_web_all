package step01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {

			/**
			 * 입력한 4개의 정수중 가장 큰 값을 출력하는 프로그램을 작성 하세요.
			 * (메서드 추가 x 코딩해야하는 부분만 코딩)
			 */
				try{
					Scanner sc = new Scanner(System.in);
					System.out.println("첫번째 정수 입력 : ");
					int a = sc.nextInt();
					System.out.println("두번째 정수 입력 : ");
					int b = sc.nextInt();
					System.out.println("세번째 정수 입력 : ");
					int c = sc.nextInt();
					System.out.println("네번째 정수 입력 : ");
					int d = sc.nextInt();
					System.out.println("결과 : " + max(a, b, c, d));
				}catch (InputMismatchException e) {
					System.out.println("정수만 입력해 다오...");
					System.exit(-1);
				}
			}
			
			public static int max(int a, int b, int c, int d){
				//코딩....
				int max = (a > b)?a:b;
				max = (max > c)?b:c;
				max = (max > d)?c:d;
				return max;
	}

}
