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
  void placeOrder(int product)
  {
	   System.out.println("placeOrder of single product");
	  System.out.println("product :" + product);
	  
	  
  }
  void placeOrder(int product1,int product2,int product3)
  {
	  System.out.println("placeOrder of multiple product");
	  
	  System.out.println("product1  :" + product1);
	  System.out.println("product2  :" + product2);
	  System.out.println("product3  :" + product3);
	 
  }
  void placeOrder( int product4,int discount)
  {
	   System.out.println("placeOrder applies a discount coupon");
	   System.out.println("product before discount : "+ product4)
	    discount=product4*(discount/100);
	   System.out.println("product after discount  :" + discount);
	  
  }
  
}
class ECommerceApplication
{
	public static void main(String[]args)
	{
		  placeorder p=new placeorder();
		  System.out.println("--------------------");
		  p.placeOrder(1200);
		  p.placeOrder(1200,1344,1234);
		  p.placeOrder(1600,10);
	}
}