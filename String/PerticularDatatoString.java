class PerticularDatatoString
{
 public static void main(String[]args)
 {
	 int count=0;
   String s=new String("latika");
   String str="";
   for(int i=s.length()-1;i>=0;i--)
   {
	   str+=s.charAt(i);
   }
   System.out.println("reverse string="+str );
 }
}