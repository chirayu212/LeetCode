package general;

public class BinarySearch {

	// Function to find the first occurrence of a given number
	// in a series with adjacent elements differing by 1
	static int findFirstOccurrence(int[] arr, int target) {
		
		
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, -2, -1, 0, 1, 2, 3 };
		int target = 1;

		int result = findFirstOccurrence(arr, target);

		if (result != -1) {
			System.out.println("First occurrence of " + target + " is at index " + result);
		} else {
			System.out.println(target + " not found in the array");
		}
	}
}
