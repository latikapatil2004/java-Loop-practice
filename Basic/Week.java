
	  /*Question 31: Write a java program to input week number(1-7) and
 print the corresponding day of week name using if else.
 How to print day of week using if else in java programming.
Input:
Week Number = 3
Output:
Wednesday

Explanation:
If week number is:
1 ? Monday
2 ? Tuesday
3 ? Wednesday
4 ? Thursday
5 ? Friday
6 ? Saturday
7 ? Sunday

If the input is not between 1–7, print Invalid Week Number.
*/

 import java.util.Scanner;
 class Week{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the week number");
  int WeekNumber=sc.nextInt();
  if(WeekNumber==1){
  System.out.println("Monday");
  }else if(WeekNumber==2){
    System.out.println("Tuesday");
  }else if(WeekNumber==3){
    System.out.println("Wednesday");
  }
  else if(WeekNumber==4){
    System.out.println("Thursday");
  }
  else if(WeekNumber==5){
    System.out.println("Friday");
  }
  else if(WeekNumber==6){
    System.out.println("Saturday");
  }
  else if(WeekNumber==7){
    System.out.println("Sunday");
  }
  else{
System.out.println("invalid input");
  }
  
  }
  }