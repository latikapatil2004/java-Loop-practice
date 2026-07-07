/*Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 250 × 1.5 = 375
Total Bill = 199 + 375 = 574 */

 import java.util.*;
  class Bill
  {
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the minutes");
	int minutes=sc.nextInt();
	double bill;
	int ExtraMinutes=minutes-100;
	if(minutes<=100)
	{
	 bill=199;
	}
	else if(minutes>=101 && minutes<=300)
	{
	bill=199+(ExtraMinutes*1);

	}
	else if(minutes>=301 && minutes<=500)
	{
	bill=199+(ExtraMinutes*1.5);
	
	}
	  else {
	   bill=199+(ExtraMinutes*2);
	}
	System.out.println("Total Bill = " + bill);
   }
  }