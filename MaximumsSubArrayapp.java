/*Question 47: Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.
Input:
Array = [1, 3, 6, 21, 4, 9, 12, 3, 16, 10]
K = 4

Output:
Maximums = [21, 21, 21, 21, 12, 16, 16]

Explanation:
Slide a window of size K across the array and determine the maximum element within each window.*/


 import java.util.Scanner;
  class MaximumsSubArrayapp
  {
    public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
		
		int a[]=new int[10];
		System.out.println("enter the array element");
		int k=4;
		
		
		for(int  i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("[");
		for(int i=0;i<a.length-k;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++){
			if(a[j]>max)
			{
				max=a[j];
			}
			
		}
		   System.out.print(max);

            if(i < a.length-k)
            {
                System.out.print(", ");
            }
        }

        System.out.println("]");
	}
	     	
}
  
  