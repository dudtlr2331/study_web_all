package step02;
//실행시키기위한 class
public class FilrstApp {
	public static void main(String[] args) {
		
		//객체 생성
		Student 류완선 = new Student();
		Student 성영식 = new Student();
		
		류완선.age = 31;
		
		System.out.println(류완선.age);
		System.out.println(류완선.name);
		System.out.println(성영식.age);
		
		Student 김준성 = null;
		김준성 = new Student();
		
		System.out.println(김준성.age);
	}
}
