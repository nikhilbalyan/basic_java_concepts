package november_21st_2017;

import java.util.Arrays;

public class AllSubString {
	static String[] subString(String dummy) {
		String[] str = new String[(dummy.length() * (dummy.length() + 1)) / 2];
		System.out.println(dummy.length() + 1);
		StringBuilder singleString = new StringBuilder("");
		int index = 0;
		for (int len = 1; len <= dummy.length(); len++) {

			for (int i = 0; i <= dummy.length() - len; i++) {
				singleString = new StringBuilder("");
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {
					// System.out.print(dummy.charAt(k));
					singleString.append(dummy.charAt(k));
				}
				// System.out.println("index = "+index);
				str[index++] = singleString.toString();
				// System.out.println();
			}
		}

		/*
		 * for (int k = 0; k < index; k++) { System.out.println(str[k]); }
		 */
		return str;
	}

	static String calculateScore(String text, String prefix, String suffix) {
		String subStr[] = subString(text);
		int[] count = new int[(text.length() * (text.length()+1))/2];
		Arrays.fill(count, 0);
		int index = 0;
		/*
		 * for(int i = 0; i < subStr.length; i++) {
		 * System.out.println(subStr[i]); }
		 */
		int maxPrefix=0;
		int maxSuffix=0;
		int totalMax=0;
		String maxScoreString="";

		for (int j = 0; j < subStr.length; j++) {
			maxPrefix = 0;
			for (int i = 0; i < prefix.length(); i++) {
				if (prefix.charAt(i) == suffix.charAt(i)) {
					maxPrefix++;
				}
			}
		}

		return "aa";

	}

	public static void main(String[] args) {

		calculateScore("nothing", "bruno", "ingenious");
	}
}
