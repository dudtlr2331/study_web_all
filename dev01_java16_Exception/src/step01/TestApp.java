package step01;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		try {
			Scanner sc = null;
			System.out.println(sc.nextLine());
		}catch (NullPointerException e) {
			System.out.println("에러 발생.");
		}
		System.out.println("프로그램 끝.");
	}
}