package general;

import java.util.ArrayList;
import java.util.List;

public class UnCommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 = "Chirayu";
		String input2 = "Maheshwari";
		
		List<Character> list = new ArrayList<Character>();
		
		
		for(int i=0;i<input1.length();i++)
		{
			if(!(input2.contains(String.valueOf(input1.charAt(i)))))
			{
				list.add(input1.charAt(i));
			}
		}
		
		System.out.println(list);

	}

}
