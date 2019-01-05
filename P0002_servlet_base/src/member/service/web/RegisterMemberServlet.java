package member.service.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.JdbcApp;

public class RegisterMemberServlet extends HttpServlet{
	private JdbcApp jdbcApp;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		System.out.println("in doPost...");
		
		//코딩...
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String pw = req.getParameter("password");
		String pn = req.getParameter("phoneNumber");
		String gender = req.getParameter("gender");
		
		jdbcApp = new JdbcApp();
		jdbcApp.insertMemberOne(id, name, age, pw, pn, gender);
		
		PrintWriter out = resp.getWriter();
		out = resp.getWriter();
		out.write("회원가입에 성공 했습니다.");
		out.close();
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in doget...");
		doPost(req, resp);
	}
	
}
