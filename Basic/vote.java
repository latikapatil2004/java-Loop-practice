/*Question 42: Write a Java program to check whether a person is eligible to vote.
Input:
Age = 19

Output:
Eligible to Vote

Explanation:
The minimum voting age is 18 years.
If age ? 18, the person is eligible. */

 import java.util.*;
   class vote{
    public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("ennter the age");
	  int age=sc.nextInt();
	  String result=age>=18?"Eligible to Vote": "not Eligible to Vote";
System.out.println(result);
}
}	  
	  