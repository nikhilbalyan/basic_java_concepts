package extra_feature;

public class AllSubString {

	static void subString(String dummy) {
		String[] str = new String[(dummy.length()*(dummy.length()+1))/2];
		System.out.println(dummy.length()+1);
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
//				System.out.println("index = "+index);
				str[index++] = singleString.toString();
				System.out.println();
			}
		}

		for (int k = 0; k < index; k++) {
			System.out.println(str[k]);
		}
	}

	public static void main(String[] args) {
		String man = "abc";
		subString(man);
	}
}
