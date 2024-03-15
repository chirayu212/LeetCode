package general;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Apple";
		

		Map<String, Integer> map = new HashMap<String, Integer>();

		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(String.valueOf(str.charAt(i))))
			{
				map.put(String.valueOf(str.charAt(i)), map.get(String.valueOf(str.charAt(i)))+1);
			}else{
				map.put(String.valueOf(str.charAt(i)), 1);
			}
		}


		for(Map.Entry<String, Integer> mapElement : map.entrySet())
		{
				System.out.print(mapElement.getKey()+mapElement.getValue());

		}
		
		

	}

}
