/*Example: we want to design the API for sorting for integer data , character data etc 
*/
import java.util.Scanner;
public class Overloading
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		System.out.println("enter the integer arrays element");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the character arrays element");
		char ch[]=new char[size];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		sort(a);
		sort(ch);
		System.out.println("data after the sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		System.out.println("data after the sorting");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(" "+ch[i]);
		}
		
	}


public static void sort(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}
public static void sort(char ch[])
{
	for(char i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
}
}