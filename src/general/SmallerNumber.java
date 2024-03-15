package general;

public class SmallerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,7,7,7,7};
		int[] result = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				
				
				if(arr[i]>arr[j])
				{
					count++;
				}
			}
			
			result[i] = count;
		}
		
		for(int i=0; i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}
	
	
	public boolean isIsomorphic(String s, String t) {
		if(s.length()==0)
		return true;

		int count=0;
		for(int i=0;i<s.length();i++){
		if(s.indexOf(s.charAt(i))==t.indexOf(t.charAt(i)))
		count=count+1;
		}
		if(count!=s.length())
		return false;
		else
		return true;

		}

}


// 4,0