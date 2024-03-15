package general;

import java.util.ArrayList;
import java.util.List;

public class ArrayParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {3,1,2,4};
		List<Integer> list = new ArrayList<Integer>();
		int count=0,temp=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
				temp = arr1[count];
				arr1[count]=arr1[i];
				arr1[i] = temp;
				count++;
				
				
			}
			
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
