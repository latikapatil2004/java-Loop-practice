/*Question 25: Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
Input:
Array = [0, 1, 0, 3, 12]

Output:
Array = [1, 3, 12, 0, 0]

Explanation:
Traverse the array and shift all non-zero elements forward while keeping
 their order the same, then place all zeros at the remaining positions at the end*/
   import java.util.Scanner;
   class NonZero
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 	int a[]=new int[5];
		System.out.print("enter the element ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=0)
				{
					a[j]=a[i];
					j++;
				}
			}
			for (int i = j; i < a.length; i++) {
            a[i] = 0;
	}
	for (int i = j; i < a.length; i++) {
			System.out.print(a[i]+" ");
	}
	}
   }
   
   
			
			
 
 