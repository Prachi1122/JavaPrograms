package programs;

public class Pattern_Program_Reverse {

	public static void main(String[] args) {
		String s="";
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
