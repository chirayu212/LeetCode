package general;

public class ArrayInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,3,5,6};
		
		int target = 5,k=-1;
		
		
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				k=i;
				System.out.println("Index is: "+k);
			}
			else if(nums[i]>target){
				
				k=i-1;
				
			}
		}
		
		

	}

}
