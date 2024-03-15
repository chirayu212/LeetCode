package general;

public class substring1 {
	public static void main(String[] args) {
		
		substring1 str = new substring1();
		
		str.strStr("sadbutsad", "but");
		
		
	}
	
	public int strStr(String haystack, String needle) {
       // System.out.println(needle.contains(haystack));
        
        System.out.println(haystack.contains(needle));
        
        int i = haystack.indexOf(needle);

        return i;
    }

}
