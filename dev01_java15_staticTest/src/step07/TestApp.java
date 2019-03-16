package step07;

import step07.vo.MsCompany;
import step07.vo.SunCompany;

/**
 * Singletone Pattern ::
 * 하나의 클래스로부터 단 하나의 객체만 생성하고
 * 다른 곳에서는 객체 생성을 막아두려는 기법
 * 그리고 하나 만들어진 객체를 받아와서 돌려쓰는 방법을 제공하는 패턴
 * 작성방법
 * 1) static private 을 붙여서 일단 객체 하나는 생성
 * 2) 생성자 앞에 private을 붙여서 다른곳에서의 객체 생성을 막는다
 * 3) public static Object getObject() 기능을 제공해서 
 * 하나 만들어 놓은 객체를 받아갈수 있는 통로를 제공
 */
public class TestApp {
	public static void main(String[] args) {
		//내가 만든 코드
		MsCompany m01 = new MsCompany();
		System.out.println(m01); //step07.vo.MsCompany@3d012ddd
		//영식이가 만든 코드 
		MsCompany m02 = new MsCompany();
		System.out.println(m02); //step07.vo.MsCompany@6f2b958e
		
		
		//SunCompany sc = new SunCompany();
		SunCompany sc1 = SunCompany.getCompany();
		SunCompany sc2 = SunCompany.getCompany();
		SunCompany sc3 = SunCompany.getCompany();
		SunCompany sc4 = SunCompany.getCompany();
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		System.out.println(sc4);
		
	}
}