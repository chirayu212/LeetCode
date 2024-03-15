package general;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 5, 2, 1 };
		int count = 0;

		mainLoop: while (arr1.length != 0) {
			int temp = 0;
			firstFor: for (int i = count; i < arr1.length; i++) {

				if (i == arr1.length - 1 || arr1[i] > arr1[i + 1]) {
					temp = 1;
					break firstFor;
				}
			}
			if (temp == 0) {
				break mainLoop;
			}

			if (temp == 1) {
				temp = 0;
				secondFor: for (int j = 0; j < arr1.length - count; j++) {

					if (j == arr1.length - 1 || arr1[j] > arr1[j + 1]) {
						temp = 1;
						break secondFor;
					}
				}
				if (temp == 0) {
					break mainLoop;
				}
			}
			count++;
		}

		System.out.println("Count value: " + (count - 1));

	}

}
