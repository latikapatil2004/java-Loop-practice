/*Question 38: Check whether the month number is valid and display season.

   Input: 1 to 12
   Logic: if-else if to map to Winter/Spring/Summer/Autumn.
   Output: Season.
Input:
Month Number = 4
Output:
Season: Spring

Explanation:
The program checks the month number and maps it to a season as follows:
December (12), January (1), February (2) ? Winter
March (3), April (4), May (5) ? Spring
June (6), July (7), August (8) ? Summer
September (9), October (10), November (11) ? Autum */

 import java.util.*;
  class MonthApp 
  {
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the month");
  int Month=sc.nextInt();
  if(Month>=1 && Month<=12)
  {
  }
   if(Month==12 || Month==1 || Month==2)
   {
     System.out.println("Winter");
	 }
	 else if(Month==3 || Month==4 || Month==5)
	 {
	 System.out.println("Sprig");
  }
  else if(Month==6 || Month==7 || Month==8)
	 {
	 System.out.println("Summer");
  }
  else if(Month==9 || Month==10 || Month==11)
  {
  System.out.println("Autum"); 
  }
  else
	  {
		  System.out.println("MOnth no is invalid");    
     }
   }
  }
