package step01;
import java.util.Scanner;

public class Exam {
		/*
		* @Auth : K. J. S.
		* @date : 2018. 12. 17.
		* n값을 입력 받아
		* 1 ~ n까지 합을 구하세요.
		*/
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		System.out.println("1부터 n까지의 합을구합니다.");
//	 	System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//		System.out.println("결과 : " + sum(n));
//	}
//		
//	public static int sum(int n){
//		//코딩...
//		int num = 0;
//		for(int i=0; i <= n; i++) {
//			num += i;
//		}
//		return num;
//	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("n 값을 입력하세요.");
		int n = sn.nextInt();
		//코딩....
		int num = 0;
		int i = 1;
		
		for(i=1; i <= n; i++) {
			num += i;
			
			if(n == i)
			System.out.print(i+"="+num);
			else
			System.out.print(i+"+");
		}
	
		while(n >= i) {
			num += i;
			
			if(n == i)
			System.out.print(i+"="+num);
			else
			System.out.print(i+"+");
			
			i++;
		}
	}
}
