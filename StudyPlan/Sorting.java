/*Sort words in a sentence alphabetically.*/


import java.util.Scanner;
class Sorting 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].compareTo(arr[j])>0)
			{
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
		
	System.out.print("Words in alphabetical order:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	}
