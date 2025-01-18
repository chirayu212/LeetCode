
public class LongestSubStringWORepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabcabccdefgbb";
		String temp = "";
		String longestString = "";
		
		
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
			if(!temp.contains(String.valueOf(s.charAt(i))))
			{
				temp =temp+String.valueOf(s.charAt(i));
				//System.out.println(s.charAt(i));
				System.out.println(temp);
				
			}else if(temp.length()>=longestString.length())
			{
				longestString = temp;
				temp = "";
				i=i-1;
			}
		}
		
		System.out.println("Longest substring without repeating character is: "+longestString);

	}

}
