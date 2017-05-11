package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Web Application Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
		todos.add(new Todo("Rewrite code with real Database."));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
}
