package general;

public class AddingNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,2,9 };
		int temp = 0, q = 1;
		int arrayLength = a.length;
		
		// int resultTemp=0;

		while (arrayLength > 1) {
			q = q * 10;
			arrayLength--;
		}

		for (int i = 0; i < a.length; i++) {
			temp = (a[i] * q) + temp;
			q = q / 10;

		}

		temp = temp + 1;
		int[] result = new int[String.valueOf(temp).length()];
		
		for (int j = result.length - 1; j >= 0; j--) {
			result[j] = temp % 10;
			temp = temp / 10;

		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
