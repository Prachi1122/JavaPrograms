package programs;

public class ReverseStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s= "java";
		char[] a=s.toCharArray();
		int count =0;
		for(char c:a)
		{
			count++;
		}
		String rev="";
for(int i=count-1;i>=0;i--)
{
	rev = rev+s.charAt(i);
	
}
System.out.println(rev);
	}

}
