package step02;

public class Hello {

//	public static void main(String[] args) {
//		//"안녕하세요. 성영식입니다." 3번 출력해보자
//		System.out.println("안녕하세요. 성영식입니다.");
//		System.out.println("안녕하세요. 성영식입니다.");
//		System.out.println("안녕하세요. 성영식입니다.");
//
//	}
//	public static void main(String[] args) {
//		String name = "성영식";
//		System.out.println("안녕하세요."+ name +" 입니다.");
//		System.out.println("안녕하세요."+ name +" 입니다.");
//		System.out.println("안녕하세요."+ name +" 입니다.");
//	}
	public static void main(String[] args) {
		printMessage("성영식");
		printMessage("성영식");
		printMessage("성영식");
	}
	public static void printMessage(String name) {
		System.out.println("안녕하세요."+ name +" 입니다.");
		System.out.println("만나서 반갑습니다.");
		System.out.println("안녕히 가세요");
	}

}
