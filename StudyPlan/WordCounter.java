/*Example: WAP to create class name as Count words from string 
You have to Create class name as WordCounter with two methods 

void setValue(String str): this method is used for accept String as parameter 
int getWordCount(): this method can count word and return word count 
*/



import java.util.Scanner;
class word
{
	String str;
	void setValue(String s)
	{
		str=s;
	}
	int getWordCount()
	{
		String words[]=str.split(" ");
		return words.length;
	}
}
class WordCounter
{
	public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter the first string");
	 String s1=sc.nextLine();
	 word w=new word();
	 w.setValue(s1);
	 System.out.println(w.getWordCount());
	 
	 
     
    }
}