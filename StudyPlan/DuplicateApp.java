/*Remove duplicate characters from a string.*/



 import java.util.Scanner;
class DuplicateApp
{
	
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	 String str=sc.nextLine();
	 char arr[]=str.toCharArray();
	   for(int i=0;i<arr.length;i++)
	   {
		  boolean found=false;
		   for(int j=0;j<i;j++)
		   {
		   if(arr[i]==arr[j])
		   {
               found=true;
               break;			   
		   }
		   }
		   
	   if(found=false)
	   {
		   System.out.println("non-repeated character is : " +arr[i]);
		  
	   }
  }
}
}
