package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NthHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0, result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = sc.nextInt();

		Integer[] arr = { 1, 8, 5, 6, 1, 2, 5, 6, 3, 2, 1, 8, 2, 2, 56 };

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

		for (int i = 0; i < userInput; i++) {
			for (Integer j : set) {

				if (temp < j) {
					temp = j;
				}
			}
			result = temp;
			set.remove(temp);
			temp = 0;

		}

		System.out.println("Result is: " + result);

	}

}
