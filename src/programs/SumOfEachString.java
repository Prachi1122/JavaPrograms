package programs;

public class SumOfEachString {

	public static void main(String[] args) {
		int num=123456789;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;  //9
			sum=sum+digit; //0+9=9
			num=num/10;    //12345678
		}
		System.out.println("sum is "+sum);
	}
}
