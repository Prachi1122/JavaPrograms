package programs;

public class Reverse_the_words_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Prachi";
		String [] str=s.split(" ");
		for(String word:str) {
			
			for(int i=word.length()-1;i>=0;i--)
			{
				if(i>0)
				System.out.print(word.charAt(i));
				else
					System.out.print(word.charAt(i)+" ");
			}
		}

	}

}
