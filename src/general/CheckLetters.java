package general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "sqwertyju2323kgdbnc";
		
		Pattern p1 = Pattern.compile("[0-9]");
		
		Matcher m1 = p1.matcher(s1);
		
		if(m1.find())
		{
			System.out.println("No");
		}else {
			System.out.println("Yes");
			
		}
		
		

	}

}
