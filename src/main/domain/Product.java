public class Product
{

private String pID;  //To be consistent with the attribute field in the database implemented using EJB
private String productName;
private double price; //This can be Big Decimal, but for the significant figure used, it is not necessary at this moment in time
private String productDesc;
private long unitsAvailable;
private long unitsOrdered;

}
