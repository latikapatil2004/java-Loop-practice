import java.util.Scanner;
class FrequencyCounting
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	 System.out.println("enter the string");
	 String s=sc.nextLine();
	 for(int i=0;i<s.length()-1;i++)
	 {
		 int count=1;
		 for(int j=i+1;j<s.length();j++)
		 {
			 if(s.charAt(i)==s.charAt(j))
			 {
				 count++;
			 }
			 System.out.println(count);
		 }
		 
	 }
		
}