package step02.test;

import step02.JdbcApp;

public class JdbcAppTest {
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static String user = "webstudy";
	public static String password = "victory123";
	
	
	public static void main(String[] args) {
		
		//모든 회원정보 보기.
		JdbcApp app = new JdbcApp(url, user, password);
		String a = app.selectAllMemberInfo();
		System.out.println(a);
		
		//회원 하나만 가지고 오기.
//		String result2 = app.selectOneMemberInfo("kjs");
//		System.out.println(result2);
		

		//회원 가입하기.
//		String result3 = app.insertMemberOne("ksb","김새봄",28, "1", "01044443333","W");
//		System.out.println(result3);
	
		//회원 탈퇴하기.
//		String result4 = app.deleteMemberOne("ksb");
//		System.out.println(result4);
		
		//회원 수정하기.
//		String result5 = app.updateMemberOne("ksb","김새봄",29, "2", "01044445555");
//		System.out.println(result5);
	}

}
