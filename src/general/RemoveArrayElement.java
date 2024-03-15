package general;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3,2,2,3};
		int val = 3,count=0;
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				list.add(nums[i]);
			}
		}
		
		int [] finalArray = new int[list.size()];
		
		for(int i:list)
		{
			finalArray[count] = i;
			count++;
		}
		
		for(int i=0;i<finalArray.length;i++)
		{
			System.out.println(finalArray[i]);
		}
		

	}

}
