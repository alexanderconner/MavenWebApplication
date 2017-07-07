package webapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

  // Set login service with Autowiring
  @Autowired
  TodoService service;


  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
  public String showLoginPage(ModelMap model) {
    // This is where we pull todos for a specific user. Will hardcode now but must improve later.
    model.addAttribute("todos", service.retrieveTodos("Alex"));
    return "list-todos";
  }


}
