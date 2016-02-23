public class Tablet
{
   // Fields
   private String manufact;    // Manufacturer
   private String model;       // Model
   private double retailPrice; // Retail price
   private int count=0;
   
   /**
    *  The constructor accepts arguments for
    *  the tablet's manufacturer, model number,
    *  and retail price.
    */
   
   public Tablet(String man, String mod, double price)
   {
      manufact = man;
      model = mod;
      retailPrice = price;
	count++;
   }
   
   /**
    *  The setManufact method accepts an argument for
    *  the tablet's manufacturer name.
    */
   
   public void setManufact(String man)
   {
      manufact = man;
   }

   /**
    *  The setModelNumber method accepts an argument
    *  for the tablet's model number.
    */
      
   public void setMod(String mod)
   {
      model = mod;
   }
   
   /**
    *  The setRetailPrice method accepts an argument
    *  for the tablet's retail price.
    */
      
   public void setRetailPrice(double price)
   {
      retailPrice = price;
   }

   /**
    * The getManufact method returns the name of
    * the tablet's manufacturer.
    */
   
   public String getManufact()
   {
      return manufact;
   }
   
   /**
    *  The getModel method returns the tablet's
    *  model number.
    */
   
   public String getModel()
   {
      return model;
   }
   
   /**
    *  The getRetailPrice method returns the
    *  tablet's retail price.
    */
   
   public double getRetailPrice()
   {
      return retailPrice;
   }
	public getNumOfTab()
   {
	return count;
    }
}
