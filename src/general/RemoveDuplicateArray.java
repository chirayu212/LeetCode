package general;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		int [] nums = {1,1,2};
			
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
			
			
			set.add(nums[i]);
			
			
			
			
		}
		int [] sortedArray= new int[set.size()] ;
		
		
		for(int i : set)
		{
			sortedArray[count] = i;
			count++;
		}
		
		int k = sortedArray.length;
		System.out.println(k);
		
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]);
		}
		
		

	}

}
