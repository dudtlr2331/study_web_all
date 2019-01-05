package step03;

public class BreakLooping02 {
	public static void main(String[] args) {
		for (int beer = 1; beer <= 50; beer++) {
			System.out.println("맥주" + beer + "잔 마심...");
			if (beer == 10) {
				System.out.println("죽는다..." + beer + "잔 치사량임!!");
				break; // 반복문을 빠져나간다.. 17라인을 빠져나간다
			}

		} // for
		System.out.println("집에 가자~~~~");
	}
}
