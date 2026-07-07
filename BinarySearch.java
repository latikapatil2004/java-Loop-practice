/*Question 70: Binary Search (Sorted Array)
Description:
Search target using binary search.
Input:
[1,3,5,7,9]
Target = 7

Output:
Found

Explanation:
Each step halves search space.*/

import java.util.Scanner;

class BinarySearch
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the array size");
        int size=sc.nextInt();

        int a[]=new int[size];

        System.out.println("enter the array element");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter the target");
        int target=sc.nextInt();

        int left=0, right=a.length-1;

        boolean isFound=false;

        while(left<=right)
        {
            int mid=(left+right)/2;

            if(a[mid]==target)
            {
                System.out.println("Found at index "+mid);
                isFound=true;
                break;
            }

            else if(a[mid]<target)
            {
                left=mid+1;
            }

            else
            {
                right=mid-1;
            }
        }

        if(!isFound)
        {
            System.out.println("Not Found");
        }
    }
}
		 