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



//ProductController.java

@Controller

public class ProductController
{
@Autowired
private IProductService ips;

@RequestMapping("/product")
public String getPID(@RequestParam("pID") String pID, Model model)
{
Product p =  ips.getPID(pID); //This gets the method from the interface class and create an object that will be added to the next attr
model.addAttribute("product", p);
return "product";
}

}

}
