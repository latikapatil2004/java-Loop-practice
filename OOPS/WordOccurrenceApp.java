/*30. Count Occurrence of Word
Class Name: WordOccurrence
Methods:
void setData(String sentence, String word)
int getOccurrence()
Example
Input:
 Sentence: "Java is easy and Java is powerful"
Word: "Java"
Output:
 2
*/
import java.util.Scanner;
class WordOccurrence
{
  String sentence;
  String word;
  void setData(String sen,String worrd)
  {
	  sentence=sen;
	  word=worrd;
  }
  int getOccurrence()
  {
	  
	  int count=0;
	  for(int i=0;i<sentence.length();i++)
	  {
		  char ch=sentence.charAt(i);
		  if(ch==word.charAt(0))
		  {
			  count++;
		  }
	  }
	  return count;
  }
}
class WordOccurrenceApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word:");
        String word = sc.nextLine();
		WordOccurrence w=new WordOccurrence();
		w.setData(sentence,word);
		System.out.println("occcurence of word is="+w.getOccurrence());
	}
}
