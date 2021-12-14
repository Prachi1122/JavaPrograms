package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharactersInTheString {

	public static void main(String[] args) {
		String s="india";
		//create a set collection and add all char of given string  int set 
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
for(Character ch:set) 
	System.out.print(ch);

	}

}
