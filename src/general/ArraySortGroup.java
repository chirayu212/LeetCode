package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {1,5,7,2,3,6,7,8,9};
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i=i+3)
		{
			for(int j=i+2;j>=i;j--)
			{
				list.add(a[j]);
			}
		}
		
	
		
		System.out.println(list);
		
		Integer[] result =  list.stream().toArray(Integer[]::new);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}

}
