package general;

public class ConsecutiveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Amazon is a great company as it haas Atooozzzz";
		int result=0,j;
		char c=' ';
		
		
		loop1:for(int i=0;i<str.length()-1;i++)
		{
			int count=0;
			if(str.charAt(i)==' ')
			{
				continue loop1;
			}
			
			loop2: for(j=i;j<str.length()-1;j++)
			{
				if(str.charAt(j)==str.charAt(j+1))
				{
					count++;
					
				}
				else 
				{
					break loop2;
				}
			}
			if(result<count)
			{
				result=count;
				c=str.charAt(j);
			}
		}
		
		System.out.println(c);
		
		

	}

}
