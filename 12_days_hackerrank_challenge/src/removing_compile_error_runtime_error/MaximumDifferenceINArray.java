package removing_compile_error_runtime_error;

public class MaximumDifferenceINArray {

	static int maxDifference(int[] a) {
		int maxDiff = -1;
		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			while (j < a.length && a[j] > a[i]) {
				if ((a[j] - a[i]) > maxDiff)
					maxDiff = a[j] - a[i];
				j++;
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		int a[] = { 1, 22, 33, 56 };
		int maxDiff = maxDifference(a);
		System.out.println(maxDiff);
	}
}
