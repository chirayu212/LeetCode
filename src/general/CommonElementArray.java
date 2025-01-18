package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a1 = { 1, 2, 3, 2, 1 };
		Integer[] a2 = { 1, 2, 3 };
		Integer[] a3 = { 1, 2, 3, 4 };
		
		Set<Integer> set = new HashSet<>();
		

		List<Integer> l1 =  Arrays.asList(a1);
		List<Integer> l2 =  Arrays.asList(a2);
		List<Integer> l3 =Arrays.asList(a3);
		
		
		for(int i=0;i<l1.size()-1;i++)
		{
			if(l2.contains(l1.get(i)) && l3.contains(l1.get(i)))
			{
				set.add(l1.get(i));
			}
		}
		
		List<Integer> result = new ArrayList<Integer>(set);
		System.out.println(result);

	}

}
