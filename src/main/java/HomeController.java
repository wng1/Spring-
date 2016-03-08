import org.springframework.stereotype.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController
{

@RequestMapping("/")
public String welcome(Model model) 
{
model.addAttribute("intro", "Welcome to the Supply Chain Management System!");
model.addAttribute("brief", "Fast, Quick and Reliable service");

return "welcome";

}
