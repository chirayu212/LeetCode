package general;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aagsjashjsjjaka";
		Set<Character> set = new HashSet<Character>();
		
		
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		
		for(Character c :set)
		{
			System.out.print(c);
		}

	}

}
