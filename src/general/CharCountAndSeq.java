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

public class CharCountAndSeq implements Comparator<Map.Entry<String, Integer>> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Kapoor";

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o2.getValue().compareTo(o1.getValue());
			}

		});
		
		for (Entry<String, Integer> entry : list) {
			
			System.out.println(entry.getValue());
			
			Character.valueOf(entry.getKey().charAt(0));
		}

	}

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
