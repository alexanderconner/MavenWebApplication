package webapp.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import webapp.login.LoginService;

@Controller
@SessionAttributes("username")
public class LoginController {

  // Set login service with Autowiring
  @Autowired
  LoginService service;


  @RequestMapping(value = "/login2", method = RequestMethod.GET)
  public String showLoginPage() {
    return "login2";
  }


  @RequestMapping(value = "/login2", method = RequestMethod.POST)
  public String handleloginRequests(@RequestParam String username, @RequestParam String password,
      ModelMap model) {
    if (!service.isValid(username, password)) {
      model.put("loginError", "Invalid credentials");
      return "login2";
    }
    model.put("username", username);
    model.put("password", password);
    return "welcome2";
  }


}
