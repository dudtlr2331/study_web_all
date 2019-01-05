package step01;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("n 값을 입력하세요."); 
	        int n = sc.nextInt();
			//코딩...
	        int num = 0;
	        
	        if(n % 2 == 0) {
	        	num = (1 + n) * n/2;
	        }else
	        	num = n * ((n/2)+1);
	        
	        System.out.println(num);
	}
}