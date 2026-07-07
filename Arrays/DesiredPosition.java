/*Question 12: Write a program in java to insert an element at desired position from an array.
Input the size of array : 6

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to insert : 2
Value : 200

Expected Output : The new list is : 1 2 200 3 4 5*/

  import java.util.Scannner;
   class DesiredPosition
   {
    public static void main(String[]args)
	{
	 Scannner sc=new Scannner(System.in);
	 System.out.println("ennter the element");
	 int a[]=sc.nextInt();
	 for(int i=0;i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	   }
	   int pos=sc.nextInt();
	   