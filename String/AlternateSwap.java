/*38. Swap Alternate Elements

Input:

6
10 20 30 40 50 60

Output:

20 10 40 30 60 50*/

import java.util.Scanner;

class AlternateSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		for(int i=0;i<size-1;i+=2)
		{
		 int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
		System.out.println("after the swapp");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(" "+arr[i]);
	   }
	}
}
