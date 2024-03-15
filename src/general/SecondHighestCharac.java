package general;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondHighestCharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aaabcbvvbbnnshsshja";
		int highest=1;
		int secondHighest=1;
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		
		for(int i=0;i<s1.length();i++)
		{
			
			if(map.containsKey(String.valueOf(s1.charAt(i))))
			{
				map.put(String.valueOf(s1.charAt(i)), map.get(String.valueOf(s1.charAt(i)))+1);
			}
			else {
				map.put(String.valueOf(s1.charAt(i)), 1);}
		}
		
		for(Entry<String, Integer> mapElement: map.entrySet())
		{
			System.out.print(mapElement.getValue());
			if(mapElement.getValue()>highest)
			{
				highest=mapElement.getValue();
			}else if(mapElement.getValue()<highest && mapElement.getValue()>secondHighest)
			{
				secondHighest=mapElement.getValue();
			}
		}
		
		System.out.println("Second highest value: "+secondHighest);

	}

}
