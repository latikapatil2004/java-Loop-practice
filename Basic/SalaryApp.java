/*Question 14: Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                  Basic Salary <= 10000 : HRA = 20%, DA = 80%
                  Basic Salary <= 20000 : HRA = 25%, DA = 90%
                   Basic Salary > 20000 : HRA = 30%, DA = 95%
Input:
Basic Salary = 15000

Output
Gross Salary = 32250

Explanation:
Since 15000 ? 20000:
HRA = 25% of 15000 = 3750
DA = 90% of 15000 = 13500

Gross Salary = 15000 + 3750 + 13500 = 32250 */

 import java.util.*;
  class SalaryApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the salary");
	 int salary=sc.nextInt();
	 if(salary<=10000){
	   int grosssalary= salary+salary*(20/100)+salary*(80/100);
	   System.out.println(grosssalary);
	}
	else if(salary <= 20000 ){
	      int grosssalary= salary+salary*(25/100)+salary*(90/100);
	       System.out.println(grosssalary);
	 }
	 else if(salary > 20000){
	    int grosssalary= salary+salary*(30/100)+salary*(95/100);
	    System.out.println(grosssalary);
	 }
	 }
	 }