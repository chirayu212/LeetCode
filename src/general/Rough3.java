package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rough3 {
	
	static int x = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1};
			//moveZeroes(nums);
			
			//Rough3 r = new Rough3();
			
			System.out.println(x);
			

	}
	
	public void moveZeroes(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        
        System.out.println(x);
        
        for(int i=0;i<nums.length;i++)
        {
        	list.add(nums[i]);
        }
        
        for(int i=0;i<list.size();i++)
        {
        	if(list.get(i)==0)
        	{
        		
        		list.remove(i);
        		
        		list.add(0);
        		
        		
        	}
        	System.out.println(list.get(i));
        	nums[i]=list.get(i);
        }
        
        
        
        for(int k=0;k<nums.length;k++)
        {
        	//System.out.print(nums[k]+" ");
        }
        
    }

}
