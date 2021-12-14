package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInTheString {

	public static void main(String[] args) {
		String s="Welcome To Bangalore";
		String[] str=s.split(" ");
		//create any set collection and add all string array values into the set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
			for(String word:set) {
				System.out.println(word+" ");
			}
		}
	}

}
