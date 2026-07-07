public class Practice2 {

    public static void main(Stirng[]args) {
		String str="java is my love";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.println(word);
			}
		}
	}
}

       