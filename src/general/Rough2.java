package general;

public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a test string";
		
		str= str.concat(String.valueOf(str.charAt(str.length()-1)));
		String result="";
		
		
		/*for(int i=str.length()-1;i>=0;i--)
		{
			if(!(str.charAt(i)==' '))
			{
				result = result+String.valueOf(str.charAt(i));
			}
			else {
				result = result+" ";
			}
		}*/
		
		//System.out.println(result);
		
		
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' || i==str.length()-1)
			{
				for(int j=i-1;j>=0 && str.charAt(j)!=' ';j--)
				{
					result = result+String.valueOf(str.charAt(j));
				}
				result=result+" ";
			}
		}
		
		System.out.println(result);

	}

}
