package general;

import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int [] candidate = {2,3,6,7};
		combinationSum(candidate, 7);

	}
	
	
	
public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	
	int newTarget=target;
	int k=0;
	
	
	while(newTarget>0)
	{
		//System.out.println("Target Value: "+newTarget);
		if(newTarget-candidates[k]>=0)
		{
			
			newTarget = newTarget-candidates[k];
			System.out.print(candidates[k]+" ");
			
			k++;
			
		}
		else if(newTarget==0)
		{
			
			
		}
		else
		{
			
			k=0;
		}
	}
	
	
	return null;
	
	
	
        
    }

}
