package day01.step04;

public class AppTest {

	public static void main(String[] args) {
		
		//배열 일때
		//1번 방법
//		String[] name = new String[2];
//		String name[] = new String[2];
//		name[0] = "김준성";
//		name[1] = "성영식";
//		//name[2] = "류완선";

		//2번 방법
//		String[] name = {"김준성" , "성영식"};
//		String name[] = {"김준성" , "성영식"};
//		//name [2] = "류완선"; //xxxxx
		
		//3번 방법
//		String[] name = new String[] { "김준성" , "류완선"};
//		String name[] = new String[] { "김준성" , "류완선"};
		
		//4번 방법
//		String[] name = new String[] {new String("류완선"), new String("김준성")};
//		String name[] = new String[] {new String("류완선"), new String("김준성")};

//		String str1 = "문자";
//		String str2 = new String("문자");

		//문제1.
		// 타입 String, 배열 길이 4짜리를 만들어서 "김준성", "류완선", "성영식", "김새봄" 을 넣으시오.
//		String[] name = new String[4];
//		name[0] = "김준성";
//		name[1] = "류완선";
//		name[2] = "성영식";
//		name[3] = "김새봄";
		// 문제2
		//name 배열에 담긴 이름을 모두 출력. (for문 사용)
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
	
//		for(int i=0; i<name.length; i++) {
//			if(i == name.length-1; i++) {
//				System.out.println(name[i]);
//			}else {
//				System.out.println(name[i]+", ");
//			}
//			System.out.print(name[i]+" ");
//		//		}
		
		//학교를 만든다.
		// 시온고등학교
//		School s = new School();
//		s.setName("시온고등학교");
		School s = new School("시온고등학교");
		
		//선생님 만든다. -> setter , getter
		//하승현, 45
		Teacher t01 = new Teacher();
		t01.setName("하승현");
		t01.setAge(45);
		
		
		
		//학생 만든다. -> 생성자.
		//김준성, 31
		//류완선, 31
		//성영식, 20
		Student s01 = new Student("김준성" , 31);
		Student s02 = new Student("류완선" , 31);
		Student s03 = new Student("성영식" , 20);
		
		
	}
}