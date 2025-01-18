package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.yaml.snakeyaml.util.ArrayUtils;

public class Fortinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 5, 5, 6 };
		int[] arr2 = { 5, 5, 6, 5, 1};
		int flag = 0;
		
		
		
		
		  
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		
		
		

		if(set1.size()==set2.size())
		{
			List<Integer> list1 = new ArrayList<Integer>(set1);
			List<Integer> list2 = new ArrayList<Integer>(set2);
			
			Collections.sort(list1);
			Collections.sort(list2);
			
			for(int j=0;j<list1.size();j++)
			{
				if(!(list1.get(j)==list2.get(j)))
				{
					flag=1;
					System.out.println("Not Equal");
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.println("Both are equal");
			}
			
		}else {
			System.out.println("Not equal");
		}
		
	}
}
