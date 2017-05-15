package webapp.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.LoginService;
import webapp.todo.TodoService;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{
	
	private LoginService validate = new LoginService();
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Delete the todo object from the delete jsp link in the database
		
		//We should try to delete based on the id of the todo, not the name.
		todoService.deleteTodo(new Todo(request.getParameter("deletetodo")));
		//redirect back to the main todo page. 
		response.sendRedirect("/todo.do");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
