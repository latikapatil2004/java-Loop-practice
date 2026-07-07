/*42. Find the first repeated character.*/



 import java.util.Scanner;
class Repeated
{
	
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	 String str=sc.nextLine();
	 char arr[]=str.toCharArray();
	   for(int i=0;i<arr.length;i++)
	   {
		   int count=0;
		   for(int j=0;j<arr.length;j++)
		   {
		   if(arr[i]==arr[j])
		   {
               count++;			   
		   }
		   }
		   
	   if(count>1)
	   {
		   System.out.println("non-repeated character is : " + arr[i]);
		   break;
	   }
  }
}
}
