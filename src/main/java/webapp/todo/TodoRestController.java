package webapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

  @Autowired
  TodoService service;

  @RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
  public Todo retrieveAllTodos(@PathVariable int id) {
    return service.retrieveTodo(id);
  }

}
