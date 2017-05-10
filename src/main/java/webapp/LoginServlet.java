package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	private userValidationService validate = new userValidationService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		if (validate.isValid(request.getParameter("username"), request.getParameter("password")))
		{
			request.setAttribute("WelcomeName", request.getParameter("username"));
			request.setAttribute("WelcomePassword", request.getParameter("password"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}	
		else
		{
			request.setAttribute("loginError", "Login Unsuccessful");

			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		

		
		//1:18
	}

}
