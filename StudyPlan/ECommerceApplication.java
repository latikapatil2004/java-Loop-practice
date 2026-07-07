/*3.	E-Commerce Application
In an e-commerce website, the placeOrder() functionality should support ordering a single product, multiple products, and products with a discount coupon. How would you use method overloading for the placeOrder () method?
Scenario: Customers can place orders in different ways.
Case 1: The customer purchases a single product.
              Case 2: The customer purchases multiple products at once.
Case 3: The customer purchases products and also applies a discount coupon
All these actions perform the same task of placing an order, but they require different input data.  
 */
 
 
 class placeorder
{
  void placeOrder(String product)
  {
	   System.out.println("placeOrder of single product");
	  System.out.println("product :" + product);
	  
	  
  }
  void placeOrder(String[]product)
  {
	  System.out.println("placeOrder of multiple product");
	  for(int i=0;i<product.length;i++)
	  {
		 System.out.println(" Product :" + product[i]); 
	  }
	  
	 
	 
  }
  void placeOrder( String[]product,String coupon)
  {
	   System.out.println("ordr with coupon");
	   for(int i=0;i<product.length;i++)
	  {
		 System.out.println(" Product :" + product[i]); 
	  }
	  System.out.println("coupon : " + coupon);
	  
  }
  
}
class ECommerceApplication
{
	public static void main(String[]args)
	{
		  placeorder p=new placeorder();
		  System.out.println("--------------------");
		  p.placeOrder("dress");
		  
        System.out.println("------");

		  String items[]={"ghagra ","chrget","laptop"};
		  p.placeOrder(items);
		  
        System.out.println("------");

		  p.placeOrder(items,"save10");
	}
}