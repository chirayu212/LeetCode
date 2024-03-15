package general;

import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
		
		 int result =0; 
		 for(int i=0;i<nums.length;i++)
		 {
			 result = nums[i];
			 for(int j=0;j<nums.length;j++)
			 {
				 if(i==j)
				 {
					 continue;
				 }
				 
				 result = result+nums[j];
				 
			 }
		 }
		 
		 
		 return null;
		 
		 
	        
	    }

}
