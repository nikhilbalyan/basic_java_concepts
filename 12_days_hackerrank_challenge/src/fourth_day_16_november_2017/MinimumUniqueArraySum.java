package fourth_day_16_november_2017;

public class MinimumUniqueArraySum {

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	static int getMinimumUniqueSum(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		int sum = 0;
		// for (int i = 0; i < arr.length-1; i++) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[j] + 1;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 3, 3, 3, 33 };
		int sum = getMinimumUniqueSum(arr);
		System.out.println(sum);
	}
}
