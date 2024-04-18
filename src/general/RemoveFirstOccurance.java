package general;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveFirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hhsgdhasgdhsjsda";
		
		StringBuilder sb = new StringBuilder(s);
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		Pattern p;
		Matcher m;
		String temp;
		
		while(!sb.isEmpty())
		{
			for(Character c : set)
			{
				temp = String.valueOf(c);
				p = Pattern.compile(temp);
				m = p.matcher(sb);
				
				if(m.find())
				{
					System.out.println("Char index is: "+m.start());
					sb.deleteCharAt(m.start());
				}
				System.out.println("Sb is: "+sb.toString());
			}
		}
		
		System.out.println("Last Value: "+sb.toString());

	}

}
