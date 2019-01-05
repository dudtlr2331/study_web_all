package step01;

public class BasicArray {
	public static void main(String[] args) {
		// 선언
		int[] a;
		// 할당
		a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		// 선언과 동시에 할당.
		int b[] = { 1, 2, 3 };
		// 배열을 풀어줄때는 반드시 루핑문을 사용.
		// for
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// while
		int i = 0;
		while (i < b.length) {
			i++;
			System.out.println(b[i]);
		}
		// do-while
		int j = 0;
		do {
			j++;
			System.out.println(b[j]);
		} while ((j - 1) < b.length);
	}
}
