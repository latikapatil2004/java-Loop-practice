/*Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.*/
   import java.util.*;
  class MinimumThreeApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the three numbers");
	 int Number1,Number2,Number3;
	 Number1=sc.nextInt();
	 Number2=sc.nextInt();
	 Number3=sc.nextInt();
	 if( Number1<Number2 ||Number1<Number3){
	 
	 }
	 if(Number2<Number1 && Number2<Number3) {
	  System.out.println("Minimum number="+ Number2 );
	  
	  }
	  if(Number3<Number1 && Number3<Number2){
	   
	   System.out.println("Minimum number="+ Number3);
	  
	  }else{
	  System.out.println("Minimum number="+ Number1);
	  }
   }
  }
	 