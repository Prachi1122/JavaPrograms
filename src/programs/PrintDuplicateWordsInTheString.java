package programs;

import java.util.LinkedHashSet;

public class PrintDuplicateWordsInTheString {

	public static void main(String[] args) {
		String s="Welcome To To Bangalore";
		String[] str=s.split(" ");
		//create any set collection and add all string array values into the set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
			//compare each values of set with all the values of string array
			for(String word:set)
			{
				int count=0;
				for(int i=0;i<str.length;i++) 
				{
					if(word.equals(str[i])) 
					{
						count++;
					}
				}
				//print both word and count
				System.out.println(word+" "+count);
			}

		

	}

}
