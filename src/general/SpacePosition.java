package general;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpacePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is a phone";
		String concatString="";
		
		StringBuilder sb = new StringBuilder(s);
		
		String[] reverseString = sb.reverse().toString().split(" ");
		
		for(int i=0;i<reverseString.length;i++)
		{
			concatString = concatString+reverseString[i];
		}
		
		StringBuilder sb1 = new StringBuilder(concatString);
		
		System.out.println(sb1);
		
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.start());
			sb1.insert(m.start(), " ");
		}
		
		System.out.println(sb1.toString());
		
	}

}
