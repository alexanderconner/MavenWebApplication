package webapp.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class TodoController {

  // Set login service with Autowiring
  @Autowired
  TodoService service;


  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
  public String listTodos(ModelMap model) {
    // This is where we pull todos for a specific user. Will hardcode now but must improve later.
    model.addAttribute("todos", service.retrieveTodos("Alex"));
    return "list-todos";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
  public String showTodoPage() {
    return "todo";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
  public String addTodo(ModelMap model, @RequestParam String desc) {
    service.addTodo("Alex", desc, "Name test", "Category test", new Date(), false);
    model.clear();
    return "redirect:list-todos";
  }

}
