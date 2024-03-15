package general;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String str1="amazon",str2="azonam";
		 * 
		 * StringBuilder sb = new StringBuilder(str1);
		 * 
		 * String s = sb.substring(0, 2); sb.append(s); sb.delete(0, 2);
		 * 
		 * System.out.println(sb);
		 * 
		 * Integer i = 6;
		 */

		int[] digits = { 9, 8, 9 };

		numb(digits);

	}

	public static int[] numb(int[] digits) {

		long temp = 0;
		int count = digits.length - 1;

		for (int i = 0; i < digits.length; i++) {

			System.out.println(digits[i]);
			temp = temp * 10 + digits[i];

			System.out.println("Temp= " + temp);
		}

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Temp= " + temp);
		temp = temp + 1;

		System.out.println("Temp= " + temp);

		if (temp % 10 == 0) {

			while (temp % 10 == 0) {

				list.add(0);
				temp = temp / 10;
			}

			while (temp != 0) {
				
				list.add((int) temp%10);
				temp = temp / 10;

			}
			int[] result = new int[list.size()];

			int j = list.size() - 1;

			for (int i : list) {
				result[j] = i;
				j--;
			}

			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}

			return result;

		} else {

			System.out.println("Else block");

			int[] result = new int[digits.length];

			while (temp != 0) {
				result[count] = (int) (temp % 10);

				temp = temp / 10;
				count--;

			}

			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}

			return result;

		}

	}

}
