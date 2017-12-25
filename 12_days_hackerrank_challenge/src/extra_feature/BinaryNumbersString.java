package extra_feature;

import java.util.Scanner;

public class BinaryNumbersString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 25;
		String remainder = new String("");
		while(num != 0) {
			remainder += num %2;
			num /=2;
		}
		String finString = new String("");
		for(int i = remainder.length()-1; i >= 0; i--) {
			finString += remainder.charAt(i);
		}
		System.out.println(finString);
		sc.close();
	}
}
