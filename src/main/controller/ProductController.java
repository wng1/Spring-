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
