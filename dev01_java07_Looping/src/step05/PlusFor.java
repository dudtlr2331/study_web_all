package step05;

public class PlusFor {
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		//향상된 for문
		for(int i : a) {
			System.out.print(i);
		}
		System.out.println("\n---------------");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}
}