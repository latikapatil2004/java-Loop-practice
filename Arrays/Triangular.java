/*Question 71: Print Upper Triangular Matrix
Description:
Print elements where j ? i.
Input:
n = 3

Output:
1
1 1
1 1 1

Time Complexity: O(n²)*/
   class Triangular
   {
   public static void main(String[]args)
   {
    
	int n=3;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("1");
			
		}
		System.out.println();
	}
	
	}
   }
 