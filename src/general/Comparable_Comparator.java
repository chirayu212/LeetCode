package general;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Comparable_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabccvaaccbffghkffccbb";

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			if (map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
			} else {
				map1.put(s.charAt(i), 1);

			}
		}
		
		for(Map.Entry<Character, Integer> mapElement : map1.entrySet())
		{
			System.out.println(mapElement.getKey()+" "+mapElement.getValue());
			
			
		}
		
		Comparator<Map.Entry<Character, Integer>> comp = new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
			
		};
		
		
		
		
		List<Map.Entry<Character, Integer>> list2 = new ArrayList<>(map1.entrySet());
		System.out.println(list2);
		
		list2.sort(Map.Entry.comparingByValue());
		
		System.out.println(list2);
		System.out.println(list2.get(0).toString().replace('=', ' '));
			
	
	}

	

}
