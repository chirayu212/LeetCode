package general;

import java.util.HashMap;
import java.util.Map;


public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2,2,1,1,1,2,2 };
		int k = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {

				map.put(nums[i], 1);

			}
		}

		for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
			if (mapElement.getValue() > (nums.length / 2)) {
				k = mapElement.getKey().intValue();
			} else {

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(k);

	}
}
