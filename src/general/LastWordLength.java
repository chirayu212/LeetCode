package general;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "   fly me   to   the moon  ";
		int count=0;
		
		
		str = str.trim();
		
		loop1:for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				break loop1;
			}
			
			count++;
			
			
		}
		
		System.out.println(count);

	}

}
