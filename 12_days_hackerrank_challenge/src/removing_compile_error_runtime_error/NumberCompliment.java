package removing_compile_error_runtime_error;

public class NumberCompliment {
	static int getIntegerComplement(int n) {
		String str = "";
		String subString = "";
		while (n > 0) {
			int k = n % 2;
			str = str + String.valueOf(k);
			n = n / 2;
		}
		int i = str.length() - 1;
		while (i >= 0) {
			subString = subString + str.charAt(i);
			i--;
		}

		str = "";
		for (int j = 0; j < subString.length(); j++) {
			if (subString.charAt(j) == '0') {
				str = str + "1";
			} else {
				str = str + "0";
			}
		}

		int res = 0, k = 0;

		int ii = str.length() - 1;
		// for(int ii = str.length()-1; ii >= 0; ii--) {
		while (ii >= 0) {
			res = res + ((int) str.charAt(ii) - 48) * ((int) Math.pow(2, k));
			k++;
			ii--;
		}

		return res;
	}

	public static void main(String[] args) {
		int num = 50;
		getIntegerComplement(num);
	}
}
