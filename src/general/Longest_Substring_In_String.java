package general;

public class Longest_Substring_In_String {

	public static void main(String[] args) {

		String str = "dvdfighjkklll", temp = "", result = "";

		// System.out.println("dvd".contains("d"));

		for (int j = 0; j < str.length(); j++) {

			for (int i = j; i < str.length(); i++) {
				if (!(temp.contains(String.valueOf(str.charAt(i))))) {
					temp = temp + String.valueOf(str.charAt(i));

				} else {

					if (result.length() < temp.length()) {

						result = temp;
					}

					temp = "";
				}
			}
			temp="";
		}

		System.out.println(result.length());
		System.out.println(result);
		// System.out.println(finalCounter);

	}

}
