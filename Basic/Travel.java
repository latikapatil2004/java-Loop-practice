/*Question 56: Problem Statement First
The chef has to travel to another place. For this, he can avail any one of two cab services.
? The first cab service charges XX rupees.
? The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
Input Format
? The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
Constraints
1<=T<=100
1<X<Y<=100
Input:
30 65
42 42
90 50

Output:
First
Any
Second

Explanation:
If first cab price < second ? print FIRST
If second cab price < first ? print SECOND
If both prices are equal ? print ANY */
import java.util.*;
class  Travel{
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the firstcabprice and secondcabprice");
   int firstcabprice=sc.nextInt();
   int secondcabprice=sc.nextInt();
   if(firstcabprice<secondcabprice){
   System.out.println("First");
   }
   else if(secondcabprice<firstcabprice){
   System.out.println("SECOND");
   }else{
   System.out.println("Any");
   }
   }
  }
   