package general;

public class LongestStrWORepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int lengthOfLongestSubstring(String s) {
    	
    	
    	String s1 ="b";
    	
    	String s2 = "aba";
    	
    	System.out.println(s2.contains(s1));
    	System.out.println(s1.contains(s2));
    	boolean result = s2.contains(s1);
    	
    	System.out.println(result);
    	
    	if(s2.contains(s1))
    		System.out.println("true");
    	else
    		System.out.println("hello");
    	
    	
    	return 0;
        
    }

}
