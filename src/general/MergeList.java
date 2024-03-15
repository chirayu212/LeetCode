package general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<7;i++)
		{
			//System.out.println();
			list1.add(new Random().nextInt(100));
		}
		
		for(int i=0;i<3;i++)
		{
			list2.add((new Random().nextInt(100)));
		}
		
		
		for(int i=0;i<list2.size();i++)
		{
			list1.add(list2.get(i));
		}
		
		Collections.sort(list1);
		
		for(int i : list1)
		{
			System.out.println(i);
		}

	}

}
