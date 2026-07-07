Question 14: Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers.
 
  class Swap{
  public static void main(String[]args){
       int a=5;
	   int b=10;
	   int c=a;
	   a=b;
	   System.out.println("A is="+a);
	    System.out.println("B is="+b);
		}
		}