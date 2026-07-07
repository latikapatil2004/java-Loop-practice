import java.util.*;
class PracticeApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int n = sc.nextInt();
		
		while(n!=1 && n!=4)
		{
			int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem*rem;
			n=n/10;
		}
		n=sum;
		}
		if(n==1)
		{
			System.out.print("happy");
		}
		else 
		{
			System.out.print(" not happy");
	}
}
}


