package general;

public class array1 {

	public static void main(String[] args) {
		
		int [] nums = {};
		
		searchRange(nums, 6);
		

	}
	
	
	 public static int[] searchRange(int[] nums, int target) {
		 
		 int start=-1;
		 int last=-1;
		 
		 loop1: for(int i=0;i<nums.length;i++)
		 {
			if(nums[i]== target)
			{
			 if(start != -1)
			 {
				 last = i;
				 continue loop1;
			 }
			 
			 start = i;
			 
		 }	
		 }
		 
		 int [] position = {start, last};
		 
		 System.out.println(start+" "+last);

	        
	        return position;
	    }

}
