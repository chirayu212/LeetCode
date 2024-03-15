package general;

import java.util.HashSet;
import java.util.Set;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test());
	}

	public static boolean test() {
		String s = "aba";
		int r = s.length() / 2;
		Set<String> set1 = new HashSet<String>();
		String result = "";
		String p = "";

		for (int i = 0; i < s.length(); i++) {
			set1.add(String.valueOf(s.charAt(i)));
		}

		for (String q : set1) {
			System.out.println(q);
			result = result + q;
		}
		int x = s.length() / set1.size();

		for (int j = 0; j < x; j++) {
			p = p + result;
		}

		if (s.contains(p))
			return true;
		else
			return false;
	}

}
