    import java.util.Scanner;
	class  SecondMax{
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
	     int a[]=new int[5];
		 System.out.print("enter the array element");

		
	     for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
	     System.out.print("enter the sum");
		 int sum=sc.nextInt();
		 int count=0;
	     for(int i=0;i<a.length;i++)
		 {
			 
			 for(int j=i+1;j<a.length;j++)
			 {
			 if(a[i]+a[j]==sum)
			 {
				 count++;
			 }
			 
			 }
		 }
		 
			 System.out.print(count);
		 }
	 }
	