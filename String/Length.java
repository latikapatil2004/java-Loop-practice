/*7. Find Length of String
Problem Statement
Create class StringLength with methods:
void setString(String str)
int getLength()
Method Description
void setString(String str)
Stores string.
int getLength()
Returns total number of characters in string.
Example
Input: "Programming"
Output: 11
*/

class Length
{
 public static void main(String[]args)
 {
	 int count=0;
   String s=new String("latika");
  
   for(int i=0;i<s.length();i++)
   {
	   count++;
   }
   System.out.println("length string="+count );
 }
}