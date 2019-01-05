package member.service.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberVO;
import member.service.JdbcApp;

public class ShowUpdateSerblet extends HttpServlet{
		private JdbcApp jdbcApp;
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			
			System.out.println("in doPost...");
			String id = req.getParameter("id");
			jdbcApp = new JdbcApp();
			
			MemberVO rvo = jdbcApp.selectOneMemberInfo(id);
			
			PrintWriter out = resp.getWriter();
		      out = resp.getWriter();
		      out.write("<form action=\"\" method=\"\">");
		      out.write("<h1>"+rvo.getId() + "님의 회원정보 입니다.</h1>");
		      out.write("<label>이름 : </label>");
		      out.write("<input type=\"text\" value=\""+rvo.getName()+"\"/> <br/>");
		      out.write("<label>비밀번호 : </label>");
		      out.write("<input type=\"text\" value=\""+rvo.getPassword()+"\"/> <br/>");
		      out.write("<label>성별 : </label>");
		      if(rvo.getGender().equals("M")) {
		         out.write("<label for=\"genderm\">남자</label>");
		         out.write("<input type=\"radio\" name=\"gender\" id=\"genderm\" value=\"M\" checked />");
		         out.write("<label for=\"genderw\">여자</label>");
		         out.write("<input type=\"radio\" name=\"gender\" id=\"genderw\" value=\"W\" /> <br/>");
		      }else {
		         out.write("<label for=\"genderm\">남자</label>");
		         out.write("<input type=\"radio\" name=\"gender\" id=\"genderm\" value=\"M\" />");
		         out.write("<label for=\"genderw\">여자</label>");
		         out.write("<input type=\"radio\" name=\"gender\" id=\"genderw\" value=\"W\" checked /> <br/>");
		      }
		      out.write("<input type=\"submit\" value=\"수정\"/>");
		      out.write("</form>");
		      out.close();
			
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("in doget...");
			doPost(req, resp);	
		}
}
