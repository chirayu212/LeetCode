package general;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		String finalStr = "";
		int i;

		String[] strs = { "dog", "racecar", "car" };

		loop1: for (int j = 0; j < strs.length; j++) {
			for (i = 0; i < strs.length; i++) {

				if ((i + 1) < strs.length && strs[i].charAt(count) == strs[i + 1].charAt(count)) {

					continue;

				}

				else if ((i + 1) < strs.length) {
					continue loop1;
				}

				else {

					i = i - 1;
					break;

				}
			}

			// System.out.println(finalStr);
			finalStr = finalStr + String.valueOf(strs[i].charAt(count));
			count = count + 1;

		}

		System.out.println(finalStr);

	}

}
