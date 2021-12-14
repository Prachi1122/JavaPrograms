package programs;

public class ReverseAsentenceAndWordsInIt {

	public static void main(String[] args) {
		String s="My name is Prachi";
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
