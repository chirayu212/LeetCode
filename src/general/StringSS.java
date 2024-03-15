package general;

public class StringSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo();

	}

	public static boolean demo() {

		String s = "ab";
		String goal = "ab";
		
		
		
		
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder(goal);

		for (int i = 0; i < s.length(); i++) {
			if (sb.charAt(i) != sb2.charAt(i)) {
				sb.replace(i, i+1, String.valueOf(sb2.charAt(i)));
				

			}
		}

		System.out.println(sb);

		if (s.equals(goal)) {
			return true;
		} else {
			return false;
		}

	}

}
