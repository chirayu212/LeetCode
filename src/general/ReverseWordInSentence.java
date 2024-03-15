package general;

public class ReverseWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "This is sample text";
		int count=0;
		String reverseStr="";
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==' ' || i==str1.length()-1)
			{
				for(int j=i;j>=count;j--)
				{
					if(str1.charAt(j)==' ')
					{
						continue;
					}
					reverseStr=reverseStr+str1.charAt(j);
				}
				reverseStr=reverseStr+" ";
				
				count=i+1;
			}
		}
		
		System.out.println(reverseStr.trim());
				
				

	}

}
