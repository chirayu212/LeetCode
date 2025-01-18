/*Write a program that takes a string as input and reverses only the vowels in the string, while keeping all other characters in their original positions.
𝐈𝐧𝐩𝐮𝐭: "programming"
𝐎𝐮𝐭𝐩𝐮𝐭: "prigrammong"*/

package general;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse_Vowels_only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";
		String temp = str;
		List<Integer> indexList = new ArrayList<Integer>();

		Matcher m = Pattern.compile("[aeiou]").matcher(str);

		while (m.find()) {
			indexList.add(m.start());
		}
		int count = indexList.size() - 1;
		m = Pattern.compile("[aeiou]").matcher(str);

		while (m.find()) {

			str = str.substring(0, m.start()) + String.valueOf(temp.charAt(indexList.get(count)))
					+ str.substring(m.start() + 1, str.length());

			count--;

		}

		System.out.println("Result is: " + str);

	}

}
