package general;

import java.util.regex.Pattern;

public class ReversalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Good Morning";

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) == ' ' || i == 0) {
				/*
				 * if(i==0) { System.out.print(str.charAt(0)); }
				 */

				for (int j = i; j < str.length(); j++) {
					
					/*System.out.println("In 2nd loop"+" Value of i: "+i+" "+j);
					System.out.println((Pattern.matches("\\w", String.valueOf(str.charAt(j)))));*/
					if (!(Pattern.matches("\\s", String.valueOf(str.charAt(j))))) {
						System.out.print(str.charAt(j));
					}
					
				}

				System.out.print(" ");
			}

			//
		}

		// System.out.println(result);

	}

}
