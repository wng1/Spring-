import java.sql.SQLException;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class productTest {
	public static void main(String[] args) throws SQLException 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
 
	    ProductDAO dao = (ProductDAO) context.getBean("productDAOBean");
	    for (Product product : dao.getProductList()) {
	    	System.out.println("Product ID:" + product.getPID() + " -> " + product.getProductName());
	    	
	    	//Rememeber to initialise the getters and setters to return output for these fields.
