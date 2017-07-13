package webapp.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

  @InitBinder
  protected void InitBinder(WebDataBinder binder) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }

  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
  public String listTodos(ModelMap model) {
    // This is where we pull todos for a specific user. Will hardcode now but must improve later.
    model.addAttribute("todos", service.retrieveTodos("Alex"));
    return "list-todos";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
  public String showTodoPage(ModelMap model) {
    model.addAttribute("todo", new Todo());
    return "todo";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
  public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
    if (result.hasErrors()) {
      // If there is a validation error, return user to todo page.
      return "todo";
    }
    service.addTodo((String) model.get("username"), todo.getDesc(), new Date(), false);
    model.clear();
    return "redirect:list-todos";
  }

  @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
  public String updateTodo(ModelMap model, @RequestParam int id) {
    Todo todo = service.retrieveTodo(id);
    model.addAttribute("todo", todo);
    return "todo";
  }

  @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
  public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
    if (result.hasErrors()) {
      // If there is a validation error, return user to todo page.
      return "todo";
    }
    todo.setUser("Alex");
    service.updateTodo(todo);
    model.clear();
    return "redirect:list-todos";
  }

  @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
  public String deleteTodo(ModelMap model, @RequestParam int id) {
    service.deleteTodo(id);
    model.clear();
    return "redirect:list-todos";
  }

}
