package member.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import member.MemberVO;

public class JdbcApp {

	private Connection conn;
	private	Statement st;
	private ResultSet rs;
	
	private final String url;
	private final String user;
	private final String password;
	
	public JdbcApp() {
		this.url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		this.user = "webstudy";
		this.password = "victory123";
	}
	
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
				result += "아이디 : " + rs.getString("ID")+
						", 이름 : " + rs.getString("name")+
						", 나이 : "+rs.getString("age")+
						", 성별 : " + rs.getString("gender")+
						", 비번 : " +rs.getString("password") +
						", 폰번호 : "+rs.getString("PHONE_NUMBER") +"\n";
			}
			result += "----------------------------------------------- \n";
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public MemberVO selectOneMemberInfo(String id) {
		MemberVO vo = new MemberVO();
		String result2 = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			String sql = "SELECT * FROM MEMBER A, MEMBER_DETAIL B "
					+ "WHERE A.ID = B.ID AND A.ID = '"+ id +"'";
			//System.out.println("sql : " + sql);
			rs = st.executeQuery(sql);
		
		result2 += "-------------------회원 정보--------------------- \n";
		while(rs.next()) {
					result2 += 
					"아이디 : " + rs.getString("ID")+
					", 이름 : " + rs.getString("name")+
					", 나이 : "+rs.getString("age")+
					", 성별 : " + rs.getString("gender")+
					", 비번 : " +rs.getString("password") +
					", 폰번호 : "+rs.getString("PHONE_NUMBER") +"\n";
					
					vo.setId(rs.getString("ID"));
					vo.setName(rs.getString("name"));
					vo.setAge(Integer.parseInt(rs.getString("age")));
					vo.setGender(rs.getString("gender"));
					vo.setPassword(rs.getString("password"));
					vo.setPhoneNumber(rs.getString("PHONE_NUMBER"));
		}
		result2 += "----------------------------------------------- \n";
		
		int resultRowCount = rs.getRow();
		if(resultRowCount < 1) {
			System.err.println("검색하는 회원이 없습니다.");
		}else {
			System.out.println(result2);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
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
			result = -1;
		}
		
		if(result == -1) {
			System.out.println("등록 실패.");
		}else {
			System.out.println("등록 완료.");
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
			result = -1;
		}
		if(result == -1) {
			System.out.println("삭제 실패.");
		}else {
			System.out.println("삭제 완료.");
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
			result = -1;
		}
		if(result == -1) {
			System.out.println("수정 실패.");
		}else {
			System.out.println("수정 완료.");
		}
		return result+"";
	}
}
