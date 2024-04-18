package general;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid("(]"));

	}

	public static boolean isValid(String s) {

		Pattern p;
		Matcher m;
		String temp = "";
		
		

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
				continue;
			}

			temp = String.valueOf(s.charAt(i));

			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {

				map.put(temp, 1);
			}

		}

		for (Map.Entry<String, Integer> mapElements : map.entrySet()) {
			int count=0;
			switch (mapElements.getKey()) {
			case "(":
				p = Pattern.compile("\\)");
				
				m = p.matcher(s);
				
				while(m.find())
				{
					count++;
				}
				
				if(!(count == mapElements.getValue()))
				{	
					return false;
				}
				
				break;
				
			case "{":
				p = Pattern.compile("}");
				
				m = p.matcher(s);
				
				while(m.find())
				{
					count++;
				}
				
				if(!(count == mapElements.getValue()))
				{	
					return false;
				}
				
				break;
				
			case "[":
				p = Pattern.compile("]");
				
				m = p.matcher(s);
				
				while(m.find())
				{
					count++;
				}
				
				if(!(count == mapElements.getValue()))
				{	
					return false;
				}
				
				break;

			}
		}

		return true;

	}

}
