/*Question 54: Write a Java expression using arithmetic and assignment operators to calculate net salary.
Input:
Basic Salary = 35000
Tax Rate = 12%

Output:
Net Salary = 30800

Explanation:
Tax amount = 12% of 35000 = 4200
Net Salary = 35000 ? 4200 = 30800.*/
  import java.util.*;
  class NetSalary{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the basic sallery and tax rate");
   int BasicSalary = sc.nextInt();
   int TaxRate =sc.nextInt();
   int taxamount=BasicSalary*(12/100);
   int NetSalary=BasicSalary-taxamount;
   System.out.println("NetSalary="+NetSalary);
   }
   }