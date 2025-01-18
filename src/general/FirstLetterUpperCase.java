package general;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "i love my india";
		
		
		
		String [] a = s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			StringBuilder sb = new StringBuilder(a[i]);
			
			String temp = String.valueOf(a[i].charAt(0)).toUpperCase();
			
			sb.replace(0, 1, temp);
			
			System.out.print(sb.toString()+" ");
			
			
			
			
			
			
		}
		
		

	}

}
