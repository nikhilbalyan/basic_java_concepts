package second_day_14th_november_2017;

import java.util.Scanner;

public class SumThemAll {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(summation(num));
		sc.close();
	}

	static int summation(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
