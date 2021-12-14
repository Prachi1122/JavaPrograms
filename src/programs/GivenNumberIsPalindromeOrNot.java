package programs;

public class GivenNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		int n=121;
		int n1=n;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(n1==rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");

	}

}
