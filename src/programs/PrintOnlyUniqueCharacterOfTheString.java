package programs;


import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharacterOfTheString {
public static void main(String[] args) {
		String s="india";
		//create a set collection and add all char of given string  into set 
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//compare each char of set with all the char of given string
		for(Character ch:set)
		{
			int count =0;
			for(int i=0;i<s.length();i++)
			{
				if(ch ==s.charAt(i))
				{
					count++;
				}
			}
			
			if(count==1)//to print only the unique character in the given string
			System.out.println("character present  "+ch+"="+count+"times");
		}
	}
}

