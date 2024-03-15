package general;

public class ReplaceCharString {

	public static void main(String[] args) {

		String a = "ac%bccdh";
		String b = "abrrrfghgrbccdj";
		String result = "";

		int diff = b.length() - a.length();
		firstFor: for (int i = 0; i < b.length(); i++) {
			// System.out.println(i);
			if (a.charAt(i) != b.charAt(i) && a.charAt(i) != '%') {
				System.out.println("-1");
				break firstFor;
			}

			if (a.charAt(i) != b.charAt(i) && a.charAt(i) == '%') {
				for (int j = i; j <= diff + 1; j++) {
					result = result + String.valueOf(b.charAt(j));

				}

				a = a.replace("%", result);

				
				// System.out.println(i);
			}

		}
		
		System.out.println(result);

	}
}
