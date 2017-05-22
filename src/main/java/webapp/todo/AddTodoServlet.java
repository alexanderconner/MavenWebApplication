package webapp.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.login.LoginService;
import webapp.todo.TodoService;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet{
	
	private LoginService validate = new LoginService();
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String newTodo = request.getParameter("newtodo");
		//We would actually store this in a database:
		todoService.addTodo(new Todo(newTodo));
		//Redirect to todo.do to cause a Get Request to be fired. This is done after the new todo is grabbed by the 
		//newtodo input from the jsp and added to the todoService.
		response.sendRedirect("/list-todos.do");

	}

}
