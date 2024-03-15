package general;

public class LongestPallindromic {

	public static void main(String[] args) {
		String s = "cbbd";
		
		String result = longestPalindrome(s);
		
		System.out.println(result);

	}
	
	
	 public static String longestPalindrome(String s) {
		 
		 int lengthCount=0;
		 String longestStr=null;
		 
		 
		 
		
		
		 
		 
		 for(int i=0;i<s.length();i++)
		 {
			 String result = "";
			 
			 //System.out.println("Inside first for loop");
			 result = result+s.charAt(i);
			 for(int j=i+1;j<s.length();j++)
			 {
				 String reverseResult = "";
				 //System.out.println("Inside Second for loop");
				 result = result+s.charAt(j);
				 
				 for(int k=result.length()-1;k>=0;k--)
				 {
					 //System.out.println("Inside third for loop");
					 reverseResult = reverseResult+result.charAt(k);
				 }
				
				 if(reverseResult.equals(result))
				 {
					 System.out.println("Pallandromic string is: "+result);
					 if(result.length()>lengthCount)
					 {
						 longestStr=result;
						 lengthCount=result.length();
					 }
				 }
				 
			 }
		 }
		 
		 return longestStr;
	 }
}
