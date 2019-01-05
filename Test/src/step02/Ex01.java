package step02;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
		System.out.println(sumof(6,4));
	}
	public static int sumof(int a, int b) {
		//코딩...
		int temp = 0, sum = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
}
