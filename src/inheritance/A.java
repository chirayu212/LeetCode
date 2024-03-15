package inheritance;

import java.sql.SQLDataException;

public class A implements CommonInt {
	
	public static void main(String[] args) {
		
		
		String s = "Chirayu Gopal Maheshwari";
		String result="";
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length-1;i++)
		{
			result = result+String.valueOf(s1[i].charAt(0)).toUpperCase()+".";
		}
		
		result = result+s1[s1.length-1];
		
		System.out.println(result);
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

}
