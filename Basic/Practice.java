import java.util.*;
 class Practice
 { 
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   int n=sc.nextInt();
   int rev=0;
   int temp=n;
     while(n!=0)
	 {
		 int  digit=temp%10;
		  rev=rev*10+digit;
		   temp=temp/10;
	 if(rev==n)
		  {
            System.out.println("Palindrome");	
		  }
			
	 } 
	   System.out.println(" not Palindrome");
	 }
 }
 
		