package step01;

import step01.vo.Member;

/**
 * =====================static 한 멤버들이 갖는 성질에 대해서 ==========================
 * 1. static한 성질로 지정된 멤버는 객체 생성 과정이 필요없다
 * 2. 객체가 생성되기 이전에 static한 성질의 멤버는 이미 메모리에 올라가 있다.
 * ----> 클래스 파일이 로딩될때 메모리에 올라간다.
 * (실행단계에서 가장 처음에 진행되는 단계)
 * 3. 이러한 static 멤버를 사용할때 class 이름.static 멤버;
 * 예) Math.random();
 * Integer.parseInt();
 * System.out
 * byte.MAX_VALUE;
 * 4. static 영역(블럭)안에서는 this 사용 못한다
 * 5. static은 static끼리 통한다 
 * 6. static 변수의 값은 생성된 모든 객체들이 공유한다!!!!
 * --> File(Member V) / Local(지역) V / class(전역) V
 * 
 * 
 * static한 변수는 객체 생성 과정 필요없이 바로 메모리에 올라간다.
 * 이유는 객체 생성하기 전에, Class File Loader 과정에서 미리 메모리에 올라가기 때문
 * --> 
 * 이런 성질을 잘못 이용하면 객체생성과정을 줄이고자 필드 앞에 다 
 * static으로 지정하는 일이 발생함.
 */
public class TestApp {

	public static void main(String[] args) {
		//1. 객체생성
		Member m = new Member();
		System.out.println(m.name);
		
		//2. 스태틱 접근
		System.out.println(Member.classNo);
	}

}
