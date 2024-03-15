package general;

public class ValidParentheses {

	public static void main(String[] args) {
		
		
		String str= "(}";
		
		loop1:for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(j)==')')
					{
						continue loop1;
					}
					else
					{
						System.out.println("Breaks");
						break loop1;
					}
				}
				
			}
			else if(str.charAt(i)=='[')
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(j)==')')
					{
						continue loop1;
					}
					else
					{
						break loop1;
					}
				}
			}
			else if(str.charAt(i)=='{') {
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(j)==')')
					{
						continue loop1;
					}
					else
					{
						break loop1;
					}
				}
				
			}
			else
			{
				continue;
			}
			
			
		}

	}

}
