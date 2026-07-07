/*Example: WAP to calculate the sum of left diagonal and right diagonal of matrix
*/
   import java.util.Scanner;
   class LeftRigtDiagonalSum 
   {
     public static void main(String[]args)
	 {
	   Scanner sc=new Scanner(System.in);
	   int a[][]=new int[3][3];	   
	    int ld=0,rd=0;
	   System.out.print("enter the number");
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=0;j<a.length;j++)
		   {
			  a[i][j]=sc.nextInt();
		}
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=0;j<a[i].length;j++){
			    if(i==j)
				{
					ld=ld+a[i][j];
				}
				if(j==2-i)
				{
					rd=rd+a[i][j];
				}
		   }
		  
		  
	   }
	    System.out.println("left diagonal  sum ="+ld);
		    System.out.println("right diagonal  sum ="+rd);
	 }
   }