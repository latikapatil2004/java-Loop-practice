/*Question 37: Count the number of prime numbers in an array.
Input:
Array = [2, 5, 6, 9, 11]

Output:
Count of Prime Numbers = 3

Explanation:
Check each element to see if it is divisible only by 1 and itself and count such numbers.*/
    
	 
	   import java.util.Scanner;
	 class prime
	 {
	  public static void main(String[]args)
	  {  
	  Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
		System.out.print("enter the element");
       int primec=0;
	  
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
			  
		  }
		  for(int i=0;i<a.length;i++)
		    
		
 		{
			 int count=0;
		  for(int j=2;j<=a[i];j++)
		  {
		     if(a[i]%j==0)
			 {
			   count++;
			   }
			   
		  }
		    if(count==1)
		  {
		      primec++;
		  }
		}
		    
			System.out.print("Count of Prime Numbers= " +primec);
		  }
		  }
		  

