package general;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "ammonia";
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Pattern p = Pattern.compile("[a,e,i,o,u]");
		
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			if(map.containsKey(m.group()))
			{
				map.put(m.group(), map.get(m.group())+1);
			}else {
				map.put(m.group(), 1);
			}
		}
		
		for(Map.Entry<String, Integer> mapElement : map.entrySet())
		{
			if(mapElement.getValue()<2)
				System.out.println(mapElement.getKey());
		}

	}

}
