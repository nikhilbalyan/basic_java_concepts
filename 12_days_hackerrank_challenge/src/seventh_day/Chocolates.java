package seventh_day;

public class Chocolates {
	static void calculate(int[] arr) {
		int[] resArr = new int[arr.length];
		int index = 0;
		int sum = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];

			sum = 0;
			for (int j = 1; j <= temp; j++) {
				if (j % 2 != 0) {
					sum += j;
				}
			}
			resArr[index++] = sum;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(resArr[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		calculate(a);
	}
}
