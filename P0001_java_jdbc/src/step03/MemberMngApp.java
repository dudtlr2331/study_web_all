package step03;

import java.util.Scanner;

public class MemberMngApp {
	public static void main(String[] args) {
		
		//객체의 메서드를 사용하기 위해서는 객체 생성이 필요하다.
		MemberMngApp app = new MemberMngApp();
		while(true) {
		int inputWord = app.showMenu();
	
		switch(inputWord) { 
		case 1:
			app.insertMember();
			break;
		case 2:
			app.selectMemberOne();
			break;
		case 3:
			app.updateMemberOne();
			break;
		case 4:
			app.deleteMemberOne();
			break;
		case 5:
			app.selectMemberAll();
			break;
		default:
			System.exit(-1);
			break;
		}
		
	  }
	
	}
	// 모든 회원정보 보기
	public void selectMemberAll() {
		JdbcApp jdbc = new JdbcApp();
		jdbc.selectAllMemberInfo();
	}
	// 회원정보 삭제
	public void deleteMemberOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력 하세요.");
		String id = sc.next();
		
		JdbcApp jdbc = new JdbcApp();
		jdbc.deleteMemberOne(id);
	}
	// 회원정보 수정
	public void updateMemberOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경 할 아이디를 입력 하세요.");
		String id = sc.next();
		System.out.println("이름을 입력 하세요.");
		String name = sc.next();
		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();
		System.out.println("비밀번호를 입력 하세요.");
		String password = sc.next();
		System.out.println("전화 번호를 입력 하세요.");
		String tel = sc.next();
		
		JdbcApp jdbc = new JdbcApp();
		jdbc.updateMemberOne(id,name,age,password,tel);
	}
	//해당 회원정보 보기
	public void selectMemberOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으실 아이디를 입력 해주세요.");
		String id = sc.next();
		
		//jdbc 객체 생성 -> selectMemberOne();
		JdbcApp jd = new JdbcApp();
		jd.selectOneMemberInfo(id);
	}
	
	private int showMenu() {
		System.out.println("원하시는 메뉴를 입력 하세요.");
		System.out.println("1 : 회원 등록");
		System.out.println("2 : 회원 보기");
		System.out.println("3 : 회원 수정");
		System.out.println("4 : 회원 삭제");
		System.out.println("5 : 전체 회원 리스트");
//		Scanner sc = new Scanner(System.in);
//		int inputWord = sc.nextInt();
		return new Scanner(System.in).nextInt();	
	}
	//회원등록
	private void insertMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력 하세요.");
		String id = sc.next();
		System.out.println("이름을 입력 하세요.");
		String name = sc.next();
		System.out.println("비밀번호를 입력 하세요.");
		String password = sc.next();
		System.out.println("성별을 입력 하세요.");
		String gender = sc.next();
		if(!(gender.equals("M") || gender.equals("W"))) {
			System.out.println("성별은 \"M\" 또는 \"W\"만 가능합니다.");
			return;
		}
		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();
		System.out.println("전화 번호를 입력 하세요.");
		String tel = sc.next();
		
		JdbcApp jdbc = new JdbcApp();
		jdbc.insertMemberOne(id, name, age, password, tel, gender);
		
		System.out.println("입력한 정보는 다음과 같습니다.");
		System.out.println("id : " + id + ", name :" + name + ", password : " + password
				+", gender :" + gender +", age : "+ age +", tel : " + tel);
	}
	
}
