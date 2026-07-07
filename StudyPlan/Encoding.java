/*77. Implement Run Length Encoding (RLE).
*/

class Encoding
{
	public static String isRuntime(String str)
	{
		String result="";
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
			}
			else
			{
				result=result+str.charAt(i-1)+count;
				count=1;
			}
			
		}
		 return result = result + str.charAt(str.length()-1) + count;
	}
	public static void main(String[]args)
	{
		String str="aaabbcc";
		
		System.out.println("after the compression :" +isRuntime(str));
	}
	
}

