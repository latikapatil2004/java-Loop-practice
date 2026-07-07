/*Question 24: Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
Input:

Number = 145

Output:

Strong Number

Explanation:

1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the number, it is a Strong Number*/
    import java.util.Scanner;
    class Strong
    {
		public static void main(String[]args)
		{
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
     int number=sc.nextInt();  
	 int temp=number;
	 int fact=1;
	 int sum=0;
	 while(temp>0)
	 {
	  temp=temp%10;
	  fact=fact*temp;
	  sum=sum+fact;
	  if(sum==number)
	  {
	  System.out.println("Strong number");
	  return;
	  }
	  temp=temp/10;
	  }
	  System.out.println("not Strong number");
    }
}
	  
	  
	 
	 