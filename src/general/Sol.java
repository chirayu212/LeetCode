package general;

import java.util.ArrayList;
import java.util.List;

public class Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] candidate = {2,3,5};
		List<List<Integer>> ans = combinationSum(candidate, 8);
		
		for(List<Integer> x : ans)
		{
			System.out.println(x);
		}

	}
	
	
	static List<List<Integer>> ans = new ArrayList<>();
	  static  ArrayList<Integer> ls = new ArrayList<>();

	    public static List<List<Integer>> combinationSum(int[] c, int target) {
	        cum(c, target, 0);
	        return ans;
	    }

	    public static void cum(int[] c, int target, int start) {
	        if (target == 0) {
	            ans.add(new ArrayList<>(ls)); 
	            return;
	        }

	        for (int i = start; i < c.length; i++) {
	            if (c[i] <= target) {
	                ls.add(c[i]);
	                cum(c, target - c[i], i); 
	                ls.remove(ls.size() - 1); 
	            }
	        }
	    }

}
