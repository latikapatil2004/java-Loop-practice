/*Example: WAP to  maximum sum of sub array of size k

Input:  [2,1,5,1,3,2]    k=3
Output:  9  =  [ 5,1,3]
*/
 
 import java.util.Scanner;
  class MaxSubArraySum
  {
	  public static void main(String[]args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("enter the number");
		  int a[]=new int[6];
		  int k=3,sum=0;
		  int max=a[0];
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  
		  for(int i=0;i<k;i++)
		  {
			  sum=sum+a[i];
		  }
		  if(sum>max)
		  {
			  max=sum;
		  }
		  for(int i=k;i<a.length;i++)
		  {
			  sum=sum+a[i]-a[i-k];
		  
		  if(sum>max){
			  max=sum;
		  }
		  }
		  System.out.print("Maximum subarrays sum ="+max);
		 
	  }
  }