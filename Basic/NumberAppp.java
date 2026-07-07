/*Question 52: Write a Java program using a switch case to input a month number (1-12)
 and display the number of days in that month. Consider leap year for February.
Input:
Month = 2
Year = 2024

Output:
Number of days = 29

Explanation:
The program uses a switch case for month numbers. For February (month 2), 
it checks whether the given year is a leap year. Since 2024 is a leap year,
 February has 29 days.*/

 import java.util.*;
 class NumberApp
{
  public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  int month=12;
  int year=sc.nextInt();
  if(year%4==0){
  System.out.println("leap year");
  }
   else if(year%100!=0 && year%400==0)
   {
    System.out.println("leap year");
   }
  Switch(month)
  {
    case 1:
	System.out.pritln("January");
	break;
	case 2:
	if(month)