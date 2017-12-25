package last_day;

import java.util.Scanner;

public class ReducedFractionSums {

	static int gcd(int num1, int num2) {
		if (num1 == 0 || num2 == 0)
			return 0;

		if (num1 == num2)
			return num1;

		if (num1 > num2)
			return gcd(num1 - num2, num2);
		return gcd(num1, num2 - num1);
	}

	static int lcmOfTwoNumbers(int num1, int num2) {
		return (num1 * num2) / gcd(num1, num2);
	}

	static String[] reducedFractionSums(String[] expressions) {
		String[] res = new String[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			String[] firstAndSecond = expressions[i].split("\\+");
			String firstItem[] = firstAndSecond[0].split("\\/");
			String secondItem[] = firstAndSecond[1].split("\\/");
			int fir = Integer.valueOf(firstItem[0]);
			int sec = Integer.valueOf(firstItem[1]);
			int third = Integer.valueOf(secondItem[0]);
			int fourth = Integer.valueOf(secondItem[1]);
			
			int lcmOfFraction = lcmOfTwoNumbers(sec, fourth);
			int numerator1 = (fir*(lcmOfFraction/sec)+third*(lcmOfFraction/fourth));
			int hcf = gcd(numerator1, lcmOfFraction);
			res[i] = String.valueOf(numerator1/hcf+"/"+lcmOfFraction/hcf);

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		String res[] = reducedFractionSums(arr);
		for (String item : res) {
			System.out.println(item);
		}

		// int res[] = new reducedFractionSums(arr);

		sc.close();
	}
}
