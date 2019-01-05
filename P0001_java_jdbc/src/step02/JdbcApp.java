package step02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp {

	private Connection conn;
	private	Statement st;
	private ResultSet rs;
	
	private final String url;
	private final String user;
	private final String password;
	

	public JdbcApp(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public String selectAllMemberInfo() {
		String result = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM MEMBER A, MEMBER_DETAIL B WHERE A.ID = B.ID");
			
			result += "-------------------회원 정보--------------------- \n";
			while(rs.next()) {
				result += "이름 : " + rs.getString("ID")+
						", 나이 : "+rs.getString("age")+
						", 비번 : " +rs.getString("password") +
						", 폰번호 : "+rs.getString("PHONE_NUMBER") +"\n";
			}
			result += "----------------------------------------------- \n";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String selectOneMemberInfo(String id) {
		String result2 = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM MEMBER A, MEMBER_DETAIL B "
					+ "WHERE A.ID = B.ID AND A.ID = '"+ id +"'");
		
		result2 += "-------------------회원 정보--------------------- \n";
		while(rs.next()) {
					result2 += "이름 : " + rs.getString("ID")+
					", 나이 : "+rs.getString("age")+
					", 비번 : " +rs.getString("password") +
					", 폰번호 : "+rs.getString("PHONE_NUMBER") +"\n";
		}
		result2 += "----------------------------------------------- \n";
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result2;
	}
	
	public String insertMemberOne(String id,String name, int age, String pw, String pn, String gender) {
		int result = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			String sql1 = "INSERT INTO MEMBER VALUES('" + id + "','"+ name +"',"+ age +",'"+ pw +"',SYSDATE)";
			String sql2 = "INSERT INTO MEMBER_DETAIL VALUES('" + id + "', '"+ pn +"'," + "'"+ gender +"', SYSDATE)";
			
			result = st.executeUpdate(sql1);
			result = st.executeUpdate(sql2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result+"";
	
	}

	public String deleteMemberOne(String ID) {
		int result = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			String sql1 = "DELETE FROM MEMBER WHERE ID ='"+ ID +"'";
			String sql2 = "DELETE FROM MEMBER_DETAIL WHERE ID ='"+ ID +"'";
			
			result = st.executeUpdate(sql1);
			result = st.executeUpdate(sql2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result+"";
	}

	public String updateMemberOne(String id,String name, int age, String pw, String pn) {
		int result = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			String sql1 = "UPDATE MEMBER SET name = '"+name+"', age = "+ age +" , PASSWORD = '"+ pw +"' WHERE ID ='"+ id +"'";
			String sql2 = "UPDATE MEMBER_DETAIL SET PHONE_NUMBER ='"+pn+"' WHERE ID ='"+ id +"'";

			result = st.executeUpdate(sql1);
			result = st.executeUpdate(sql2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result+"";
	}
}
