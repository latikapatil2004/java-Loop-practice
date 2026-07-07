/*Create a method that accepts any number of integers and prints them*/

class prints
{
   public void prints(int ...x)
   {
   for(int i=0;i<x.length;i++)
   {
     System.out.print(" "+x[i]);
   }
   }
}
class Variablearg2
{
	public static void main(String[]args)
	{
		prints p=new prints();
		p.prints(10,23,4,5,5,7,8,9,4,2,1);
		
	}
}