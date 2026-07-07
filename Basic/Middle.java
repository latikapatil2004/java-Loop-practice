/*Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
Input:
p = 10
q = 20
r = 15

Output:
Middle Number = 15

Explanation:
The middle number is the value that lies between the other two numbers.
Here, 15 lies between 10 and 20 */
import java.util.*;
    class Middle{
	public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the three numbers");
	  int p=sc.nextInt();
	  int q=sc.nextInt();
	  int r=sc.nextInt();
	  int middle=
	  (p > q && p < r) || (p > r && p < q) ? p :
                     (q > p && q < r) || (q > r && q<p) ? q : r;
	  System.out.println("middle is ="+middle);
	  }
	  }
	  
	  
	  
	