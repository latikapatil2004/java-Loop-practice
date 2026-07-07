/*Question 35: Check whether a given employee is eligible for bonus:

Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus
Input:
Years of Service = 7
Salary = 50000

Output:
Bonus = 2500

Explanation:
If service > 5 years ? 5% bonus
5% of 50000 = 2500
If service ? 5 ? No Bonus*/

import java.util.*;
class BonusApp{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the yearsOfService and Salary");
  int yearsOfService=sc.nextInt();
  int bonus;
  int salary=sc.nextInt();
  if(yearsOfService>5)
  {
  bonus=salary * 5 / 100;
  System.out.println(bonus);
  }
  else{
  System.out.println("no bonus");
  }
  }
  }
  
  
  
  
  