package programs;

public class AddTheNumber {

	public static void main(String[] args) {
		//add the number till you get single digit
		int n=784;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int dig=n%10;
				sum=sum+dig;
				n=n/10;
			}
			n=sum;
		}
		System.out.print(n);
	}
}
