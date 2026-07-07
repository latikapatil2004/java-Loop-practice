  import java.util.*;
  class LoopApp
   {
    public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many the number");
	   int n=sc.nextInt();
	   int evenSum=0;
	   int oddSum=0;
	   for(int i=1;i<=n;i++)
	   {
		   System.out.println("enter the number");
		   int num=sc.nextInt();
		   if(num%2==0)
		   {
			   evenSum=evenSum+num;
     } else 
	 {
		 oddSum=oddSum+num;
      }
     }
	 System.out.println("EvenSum = " +evenSum );
   System.out.println("OddSum = " +oddSum );
	}
   }

