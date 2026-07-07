/*Question 29: Write a java program to display 1 to nth Prime Number.
Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.*/

public class PrimeNum
{
	public static void main(String[] args)
	{
	     int n=10;
		  int count=0;
        //outer loop 1 to nth	
		for(int i=2;i<count;i++)
		{
			boolean flag=false;
		    //inner loop used for check number prime or not
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(i + " ");
				count++;
		}
		
	}
}
}
