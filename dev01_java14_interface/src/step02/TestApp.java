package step02;

import step02.vo.Man;
import step02.vo.Tiger;

/**
 * 인터페이스의 활용 
 * 1.표준화
 * 2.추상화
 * 3.메타데이터
 * 
 * 이예제는 "표준화"를 알아보기 위함.
 */
public class TestApp {
	public static void main(String[] args) {
		Man man = new Man();
		Tiger tiger = new Tiger();
		
//		man.punch();
//		tiger.bite();
		
		int 사람_데미지 = man.attack();
		int 호랑이_데미지 = tiger.attack();
		
	}
}