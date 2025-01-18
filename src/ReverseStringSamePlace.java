
public class ReverseStringSamePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "This is a tree";
		String reversedString = "";
		
		String [] q = s.split(" ");
		ReverseStringSamePlace a = new ReverseStringSamePlace();
		
		for(int i=0;i<q.length;i++)
		{
			reversedString = reversedString+ a.reverseString(q[i])+"%";
		}
		
		System.out.println(reversedString);
		
		

	}
	
	public String reverseString(String s)
	{
		String temp = "";
		for(int i=s.length()-1; i>=0;i--)
		{
			temp = temp + String.valueOf(s.charAt(i));
		}
		
		return temp;
	}

}
