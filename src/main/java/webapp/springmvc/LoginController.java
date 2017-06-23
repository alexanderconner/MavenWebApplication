package webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @RequestMapping(value = "/login2", method = RequestMethod.GET)
  public String showLoginPage() {
    return "login2";
  }


  @RequestMapping(value = "/login2", method = RequestMethod.POST)
  public String handleloginRequests(@RequestParam String username, @RequestParam String password,
      ModelMap model) {
    model.put("username", username);
    model.put("password", password);
    return "welcome2";
  }


}
