/*Example: WAP to find the average of all subarray of size k
k=3

*/
   import java.util.Scanner;
   class SubarrayAvg
   {
	   public static void main(String[]args)
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.print("enter the array element");
		   int a[]=new int[5];
		   int sum=0,k=3;
		   for(int i=0;i<a.length;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   
		   for(int i=0;i<k;i++)
		   {
			   sum=sum+a[i];
		   }
		   System.out.println("Average of all subarray = "+(double)sum/k);
		   for(int i=k;i<=a.length;i++)
		   {
			   sum=sum+a[i]-a[i-k];
			    System.out.println("Average of all subarray="+(double)sum/k);
		   }
		  
	   }
   }