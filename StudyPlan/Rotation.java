/*52. Check whether one string is a rotation of another.*/


import java.util.*;
class Rotation
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter the first string");
	 String s1=sc.nextLine();
	 System.out.println("enter the second string");
	 String s2=sc.nextLine();
	  String str="";
		if(s1.length()==s2.length())
		{
		  str=s1+s1;	
		
	    if(str.contains(s2))
	    {
		 
	    System.out.println("yes it is rotation of another : ");
	    }
	   else 
	   {
		  System.out.println("no it is  not rotation of another : ");
	   }
		}
	 else 
	 {
		 System.out.println("no it is  not rotation of another : ");
	 }
 }
}
