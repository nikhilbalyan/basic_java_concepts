package last_day;

import java.util.Scanner;

public class ValidBST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		boolean flag = true;
		boolean flag0 = false;
		int max = 0;
		int index;
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			index = 0;
			max = 0;
			flag0 = false;
			flag = true;

			for (int k = 0; k < n; k++) {
				arr[k] = sc.nextInt();
			}

			for (int k = 0; k < n - 1; k++) {
				flag0 = false;
				for (int j = k + 1; j < n; j++) {
					if (arr[j] > arr[k]) {
						max = arr[j];
						index = j;
						flag0 = true;
						break;
					}
				}
				if (flag0) {
					for (int l = index + 1; l < n; l++) {
						if (arr[l] < arr[k]) {
							flag = false;
							break;
						}
					}
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
