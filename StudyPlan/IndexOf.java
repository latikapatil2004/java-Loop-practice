/*Implement your own version of `String.indexOf()`.*/

class IndexOf
{
	public static int isCompareto(String str1,char ch )
	{
		
		for(int i=0;i<str1.length();i++)
		{
		if(str1.charAt(i)==ch)
		{
			return i;
		}
		
	}
	return -1;
	}
	public static void main(String[]args)
	{
		String str1="cat";
		char ch='t';
		System.out.println("index of that char :" +isCompareto(str1,ch));
	}
	
}