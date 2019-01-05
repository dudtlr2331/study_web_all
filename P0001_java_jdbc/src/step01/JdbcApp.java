package step01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp {
	
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static String user = "webstudy";
	public static String password = "victory123";
	
	
	public static void main(String[] args) throws Exception {
		//1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. 커넥션 연결
		//url 작성 방법 : jdbc:oracle:thin:@[host]:[port]:[sid or servername]
		//jdbc:oracle:thin:@127.0.0.1:1521:xe
		Connection conn = DriverManager.getConnection(url, user, password);
		//3. statement 객체생성(쿼리담는 객체)
		Statement st = conn.createStatement();
		//4. 쿼리실행 결과가 있다면 결과 리턴(ResultSet)
		ResultSet rs = st.executeQuery(
				"SELECT * FROM MEMBER A, MEMBER_DETAIL B WHERE A.ID = B.ID");
		
		System.out.println("-------------------회원 정보---------------------");
		while(rs.next()) {
			System.out.println(
					"이름 : " + rs.getString("ID") +
					", 나이 : "+rs.getString("age")+
					", 비번 : " +rs.getString("password") +
					", 폰번호 : "+rs.getString("PHONE_NUMBER"));
			
		}
		System.out.println("-----------------------------------------------");
		/*
		 	-------------------회원 정보---------------------
		 	이름 : kjs, 나이 : 31, 비번 : 1, 폰번호 : 01012341234
		 	.
		 	.
		 	.
		 	-----------------------------------------------
		 */
		
		
		
	
	}
}
