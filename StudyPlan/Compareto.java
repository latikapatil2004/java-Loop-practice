/*72. Implement your own version of `String.compareTo()`.*/

class Compareto
{
	public static int isCompareto(String str1,String str2)
	{
		 int min = Math.min(str1.length(), str2.length());
		for(int i=0;i<min;i++)
		{
		if(str1.charAt(i)!=str2.charAt(i))
		{
			return str1.charAt(i)-str2.charAt(i);
		}
		}
		return str1.length()-str2.length();
	}
	public static void main(String[]args)
	{
		String str1="cat";
		String str2="cater";
		System.out.println(isCompareto(str1,str2));
	}
	
}