package web_study_06.unit01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_study_06.dto.Member;


@WebServlet("/JoinMemeberServlet")
public class JoinMemeberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        process(request, response);
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        process(request, response);
	    }

	    private void process(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        request.setCharacterEncoding("UTF-8");
	        Member member = new Member();
	        member.setName(request.getParameter("name"));
	        member.setUserId(request.getParameter("userId"));
	        member.setNickName(request.getParameter("nickName"));
	        member.setPwd(request.getParameter("pwd"));
	        member.setEmail(request.getParameter("email"));
	        member.setPhone(request.getParameter("phone"));
	        
	        request.setAttribute("member", member);

	        request.getRequestDispatcher("03_addMemberServlet.jsp").forward(request, response);
	        
	    }

}
