package general;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		String s = "bananas";
		
		String u = "Guavavavav";
		
		
		
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.start());
			list.add(m.start());
		}
		
		

	}

}
