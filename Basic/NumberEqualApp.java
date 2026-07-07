/*Question 43: Write a Java program to accept two integers and check whether they are equal.
Input:
A = 50
B = 50

Output:
Equal

Explanation:
If both numbers have the same value, they are equal; otherwise, they are not equal.*/
    import java.util.*;
	class NumberEqualApp{
	 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 if(a==b){
	 System.out.println("equal");
	 }else{
	  System.out.println(" not equal");
	  }
	  }
	}