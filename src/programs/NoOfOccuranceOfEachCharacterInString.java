package programs;

import java.util.HashSet;

public class NoOfOccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		String s="india";
		//create a set collection and add all char of given string  int set 
		HashSet<Character> set = new HashSet<Character>();
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
			//print both char of set and count
			
			System.out.println("character present  "+ch+"="+count+"times");
		}
	}
}
