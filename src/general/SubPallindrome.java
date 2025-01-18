package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubPallindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "malayalam";
		List<String> list = new ArrayList<>();
		
		
		for(int i=0;i<s.length();i++)
		{
			
			
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					
					
					if(checkPallindrome(s.substring(i, j+1)) && !(list.contains(s.substring(i, j+1))))
					{
						list.add(s.substring(i, j+1));
					}
				}
			}
		}
		
		System.out.println(list);

	}
	
	public static boolean checkPallindrome(String s)
	{
		
		String temp="";
		for(int z=s.length()-1;z>=0;z--)
		{
			temp = temp+String.valueOf(s.charAt(z));
		}
		
		if(temp.equals(s))
		
		return true;
		
		else
			return false;
	}

}
