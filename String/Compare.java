/*9. Compare Two Strings
Problem Statement
Create class CompareString with methods:
void setStrings(String s1, String s2)
boolean isEqual()
Method Description
void setStrings(String s1, String s2)
Accepts two strings.
boolean isEqual()
Compares both strings and returns true if same.
Example
Input:
 "java", "java"
Output:
 true
*/
 class Compare 
 {
   String s1;
    String s2;
	void setString(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	boolean isEqual()
	{
	  for(int i=0;i<s1.length();i++)
	  {
		  if(s1.charAt(i)==s2.charAt(i))
		  {
			  return true;
		  }
	  }
	  return false;
		
	}
	public static void main(String[]args)
	{
		Compare c=new Compare();
		c.setString("java" ,"java");
		System.out.println(c.isEqual());
	}
}