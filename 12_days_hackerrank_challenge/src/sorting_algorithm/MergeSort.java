package sorting_algorithm;

public class MergeSort {
	// merges two subarrays of arr[]
	// first subarray is arr[1..m]
	// second subarray is arr[m+1..r]
	public static void merge(int arr[], int l, int m, int r) {

		// find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// create temp arrays
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		// copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			Left[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = arr[m + 1 + j];

		// merge two temp arrays

		// initial indexes of first and second subarrays
		int i = 0, j = 0;

		// initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		// copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		// copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}

	}

	// main function that sorts arr[1..r] using
	// merge()
	public static void sort(int arr[], int left, int right) {
		if (left < right) {
			// find the middle point
			int m = (left + right) / 2;

			// sort first and second halves
			sort(arr, left, m);
			sort(arr, m + 1, right);

			// merge the sorted halves
			merge(arr, left, m, right);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 4, 56, 89, 90, 6, 7 };
		sort(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
