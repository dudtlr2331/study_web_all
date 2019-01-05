package step04.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * db 연결하는 jdbc를 사용.
 * 
 * 1.메뉴 등록
 * 2.메뉴 가격 보기
 * 3.메뉴 수정
 * 4.메뉴 삭제
 * 5.전체 메뉴 보기
 */
public class coffeService {
	private Connection conn;
	private	Statement st;
	private ResultSet rs;
	
	private final String url;
	private final String user;
	private final String password;
	
	public coffeService() {
		this.url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		this.user = "webstudy";
		this.password = "victory123";
	}

	public coffeService(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public String insertMenu(String name, int price)  {
		int result = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			String sql1 = "INSERT INTO COFE_MENU VALUES('"+ name +"',"+ price +",SYSDATE)";
			
			result = st.executeUpdate(sql1);
			
		}catch (Exception e) {
			e.printStackTrace();
			result = -1;
		}
		
		if(result == -1) {
			System.out.println("등록 실패.");
		}else {
			System.out.println("등록 완료.");
		}
		return result+"";
	
	}

	public String updateMenuOne(String name, int price) {
		int result = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			String sql1 = "UPDATE COFE_MENU SET MENU_PRICE = "+ price +" WHERE MENU_NAME ='"+ name +"'";

			result = st.executeUpdate(sql1);
			
		}catch (Exception e) {
			e.printStackTrace();
			result = -1;
		}
		if(result == -1) {
			System.out.println("수정 실패.");
		}else {
			System.out.println("수정 완료.");
		}
		return result+"";
	}

	public String deleteMenuOne(String name) {
		{
			int result = -1;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				st = conn.createStatement();
				
				String sql1 = "DELETE FROM COFE_MENU WHERE MENU_NAME ='"+ name +"'";
				
				result = st.executeUpdate(sql1);
				
			}catch (Exception e) {
				e.printStackTrace();
				result = -1;
			}
			if(result == -1) {
				System.out.println("삭제 실패.");
			}else {
				System.out.println("삭제 완료.");
			}
			
			return result+"";
		}
		
	}

	public String selectMenuOne(String name) {
		String result2 = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			String sql = "SELECT * FROM COFE_MENU WHERE MENU_NAME = '"+ name +"'";
			rs = st.executeQuery(sql);
		
		result2 += "-------------------메 뉴--------------------- \n";
		while(rs.next()) {
					result2 += 
					"이름 : " + rs.getString("name")+
					", 가격 : "+rs.getString("price")+"\n";
					}
		result2 += "------------------------------------------- \n";
		
//		int resultRowCount = rs.getRow();
//		if(resultRowCount < 1) {
//			System.err.println("검색하는 메뉴가 없습니다.");
//		}else {
//			System.out.println(result2);
//		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result2;
		
	}

	public String selectMenuAll() {
		String result = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM COFE_MENU");
			
			result += "-------------------메 뉴--------------------- \n";
			while(rs.next()) {
				result +=" 이름 : " + rs.getString("MENU_NAME")+
						", 가격 : "+rs.getString("MENU_PRICE")+"\n";
			}
			result += "------------------------------------------- \n";
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
