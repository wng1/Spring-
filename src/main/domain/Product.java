public class Product
{

private String pID;  //To be consistent with the attribute field in the database implemented using EJB
private String productName;
private double price; //This can be Big Decimal, but for the significant figure used, it is not necessary at this moment in time
private String productDesc;
private long unitsAvailable;
private long unitsOrdered;

public Product()
{
  super(); 
}

public Product(String pID, String productName, double price)
{
  this.pID=pID;
  this.productName=productName;
  this.price=price;
}


//Use eclipse to generate the getters and setters

@Override
public boolean equals(Object obj)
{
  if (this == obj)
  return true;
  if (obj == null)
  return false;
  if(getClass() !=obj.getClass())
  return false;
  Product other = (Product) obj;
  if (pID == null)
  {
     if (other.pID) !=null)
     return false;
  } else if (!pID.equals(other.pID)
return false;
return true;
}

@Override
public int hashCode() 
{
  final int prime = 31;
  int result = 1;
  result = prime * result + ((pID == null) ? 0 : pID.hashCode());
  return result;
}

@Override
public String toString()
{
  return "Product [productID" + pID + ", productName=" + productName "]";
}

}
