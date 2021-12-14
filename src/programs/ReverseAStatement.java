package programs;

public class ReverseAStatement {

	public static void main(String[] args) {
		String s="Welcome to test yantra";
		String[] str=s.split(" ");
		for (int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}
       
	}

}
