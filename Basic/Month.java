/*Question 30: Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming
Input:
Month = 2

Output
28 or 29 Days

Explanation:
January, March, May, July, August, October, December ? 31 days

April, June, September, November ? 30 days

February ? 28 days (29 in leap year) */
  import java.util.Scanner;
  class Month{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
        int MOnth;
		System.out.println("enter the month");
		MOnth =sc.nextInt();
  if(MOnth==1|| MOnth==3||MOnth==5||MOnth==7||MOnth==8 || MOnth==10||MOnth==12)
  {
  System.out.println("31 days");
  }else if(MOnth==4||MOnth==6||MOnth==9||MOnth==11){
  System.out.println("30 days");
  }
  else if(MOnth==2){
  System.out.println("28 or 29 Days");
  }
  }
  }