package general;

import java.util.HashMap;
import java.util.Map;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String allAlphabets = "qwertyuiopasdfghjklzxcvbnm";
		String input = "zxcvbnmasdfghjklqwertyuiop";
		int flag =0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<input.length();i++)
		{
			if(map.containsKey(String.valueOf(input.charAt(i))))
			{
				map.put(String.valueOf(input.charAt(i)), map.get(String.valueOf(input.charAt(i)))+1);
			}else {
				
				map.put(String.valueOf(input.charAt(i)), 1);
			}
		}
		
		for(Map.Entry<String, Integer> mapElement : map.entrySet())
		{
			if(allAlphabets.contains(mapElement.getKey()))
			{
				
			}else {
				flag=1;
				System.out.println("String is not Pangram");
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("String is Pangram");
		}

	}

}
