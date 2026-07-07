/*8. Count Total Words
Problem Statement
Create class WordCount with methods:
void setString(String str)
int getWordCount()
Method Description
void setString(String str)
Accepts sentence.
int getWordCount()
Counts total words and returns count.
Example
Input: "Java is easy"
Output: 3
*/
class TotalWords
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	int getWordCount()
	{
	  String words[]=str.split(" ");
	  
		return words.length;
	}
	public static void main(String[]args)
	{
		TotalWords t =new TotalWords();
		t.setString("java is easy");
		System.out.println("total words in string = " + t.getWordCount());
	}
}