/* 	Given a string, find the longest substring which is palindrome.
 * 	Input: "forgeeksskeegfor"
 * 	Output: "geeksskeeg" */
public class Lps {
	static String palindrome1(String s) {
		int len = s.length();
		if (len == 1 || len == 0) return s;
		int i = 0;
		for (; i < (len / 2); i++)
			if (s.charAt(i) != s.charAt(len - 1 - i)) break;
		
		if (i == (int) len / 2) return s;
		else {
			String s1 = palindrome1(s.substring(0, len - i - 1));
			String s2 = palindrome1(s.substring(i + 1, len));
			return (s1.length() >= s2.length() ? s1 : s2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome1("babcbabcbaccba"));
	}
}
