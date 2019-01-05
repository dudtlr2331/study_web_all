package step03;

public class BreakLooping01 {
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6 + 1);
			System.out.println("Dice Number Value : " + num);
			if (num == 6) {
				System.out.println("6은 마지막 숫자이어야 합니다…");
				break;
			}
		} //
		System.out.println("프로그램을 종료합니다");

	}
}
