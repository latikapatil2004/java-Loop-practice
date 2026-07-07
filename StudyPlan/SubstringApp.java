/*74. Implement your own version of `String.substring()`.*/


class SubstringApp
{
	public static String isSubstring(String str1,int startindex,int lastindex)
	{
		String str="";
		for(int i=startindex;i<lastindex;i++)
		{
		  str=str+str1.charAt(i);
		
	  }
	return str;
	}
	public static void main(String[]args)
	{
		String str1="racecar";
		 int startindex=1;
		 int lastindex=4;
		System.out.println("index of that char :" +isSubstring(str1,startindex,lastindex));
	}
	
}