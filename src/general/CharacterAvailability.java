package general;

import java.util.Arrays;

public class CharacterAvailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="ABC";
		String s2="WXYZ";
		String s3="AWXBYCZ";
		
		String temp = s1+s2;
		char [] A = temp.toCharArray();
		
		Arrays.sort(A);
		
		char[] C = s3.toCharArray();
		Arrays.sort(C);
		
		
		for(int i=0;i<C.length;i++)
		{
			if(A[i]!=C[i])
			{
				System.out.println("False");
				
			}
		}
		
		
		
		
		
				
				

	}

}
