package webapp.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private static List<Todo> todos = new ArrayList<Todo>();

  static {
    todos.add(new Todo(1, "Alex", "Learn Web Application Development", "Name", "Study", new Date(),
        false));
    todos.add(new Todo(2, "Alex", "Learn Spring MVC", "Name", "Study", new Date(), false));
    todos
        .add(new Todo(3, "Alex", "Learn Spring Rest Services", "Name", "Study", new Date(), false));
    todos.add(new Todo(4, "Alex", "Rewrite code with real Database.", "Name", "Study", new Date(),
        false));
  }

  private int todoCount = 4;

  public List<Todo> retrieveTodos(String user) {
    List<Todo> filteredTodos = new ArrayList<Todo>();
    for (Todo todo : todos) {
      if (todo.getUser().equals(user))
        filteredTodos.add(todo);
    }
    return filteredTodos;
  }

  public Todo retrieveTodo(int id) {
    for (Todo todo : todos) {
      if (todo.getId() == id)
        return todo;
    }
    return null;
  }

  public void updateTodo(Todo todo) {
    todos.remove(todo);
    todos.add(todo);
  }

  public void addTodo(String user, String desc, String name, String category, Date targetDate,
      boolean isDone) {
    todos.add(new Todo(++todoCount, user, desc, name, category, targetDate, isDone));
  }

  public void deleteTodo(int id) {
    Iterator<Todo> iterator = todos.iterator();
    while (iterator.hasNext()) {
      Todo todo = iterator.next();
      if (todo.getId() == id) {
        iterator.remove();
      }
    }
  }
}
