/*Question 55: Develop a Java program using switch to print the day type for an input day number (1-7):
? 1 for Monday, …, 7 for Sunday.
? For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Input:
Day = 3

Output:
Weekday

Explanation:
Day numbers 1 to 5 represent Monday to Friday, so they are weekdays.

Input:
Day = 7

Output:
Weekend

Explanation:
Day numbers 6 and 7 represent Saturday and Sunday, which are weekends.*/

  import java.util.*;
  class WeekApp
  {
   public static void main(String[]args)
   {
	    Scanner sc=new Scanner(System.in);
	   System.out.println("enter the day");
   int days=sc.nextInt();
   switch(days)
   {
    case 1:
    System.out.println("Weekday");
     break;
	 case 2:
    System.out.println("Weekday");
     break;
	 case 3:
    System.out.println("Weekday");
     break;
	 case 4:
    System.out.println("Weekday");
     break;
	 case 5:
    System.out.println("Weekday");
     break;
	 case 6:
	 System.out.println("Weekend");
	 break;
	 case 7:
	 System.out.println("Weekend");
	 break;
	 }
	 }
	 }
	 