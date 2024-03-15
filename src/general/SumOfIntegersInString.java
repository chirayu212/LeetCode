package general;

import java.util.Scanner;

public class SumOfIntegersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ab50dt60h4q";
		
		
		
		//System.out.println(i.intValue())
		
		Scanner sc = new Scanner("ab50dt60h4q");
		int sum = 0;
		sc.useDelimiter("\\D+");
		while(sc.hasNext()) {
		sum+=Integer.parseInt(sc.next());
		}
		System.out.println(sum);
		}

     //   return sum;
	}


