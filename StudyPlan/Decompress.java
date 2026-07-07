/*6. Decompress a compressed string.*/
class Decompress
{
	public static String isDecompress(String str)
	{
		String result="";
		for(int i=0;i<str.length()-1;i+=2)
		{
		 int num=str.charAt(i+1)-'0';
		
		 for(int j=1;j<=num;j++)
		 {
			 
			 result=result+str.charAt(i);
		 }
		}
		 return result;
	}
	
	public static void main(String[]args)
	{
		String str="a3b3c4";
		
		System.out.println(isDecompress(str));
	}
	
}

