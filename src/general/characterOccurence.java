package general;

import java.util.HashMap;
import java.util.Map;

public class characterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aashssshashdgjadsssggs";
		String result="";
		
		Map<String, Integer> map =  new HashMap<String, Integer>();
		
		
		for(int i=0; i<s1.length();i++)
		{
			if(map.containsKey(String.valueOf(s1.charAt(i))))
			{
				map.put(String.valueOf(s1.charAt(i)), map.get(String.valueOf(s1.charAt(i)))+1);
			}else
			{
				map.put(String.valueOf(s1.charAt(i)), 1);
			}
		}
		
		for(Map.Entry<String, Integer> mapElement: map.entrySet())
		{
			result = result+mapElement.getKey()+String.valueOf(mapElement.getValue());
		}
		
		System.out.println(result);

	}

}
