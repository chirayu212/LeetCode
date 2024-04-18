package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character [] c = {'a','b','c','b','c','b'};
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//List<Integer> list = new ArrayList<Integer>();
		int temp=0;


		for(int i=0;i<c.length;i++)
		{
			if(map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}else{
				map.put(c[i],1);	
			}
		}

		List<Map.Entry<Character, Integer>> list = Map
		
		Collections.sort(list);
		
		
		System.out.println(map);
		for(Map.Entry<Character,Integer> mapElements : map.entrySet())
		{
			System.out.println(mapElements.getKey()+" "+mapElements.getValue());
		}

	}

}
