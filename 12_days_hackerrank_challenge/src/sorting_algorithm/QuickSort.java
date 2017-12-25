package sorting_algorithm;

public class QuickSort {

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1, temp;
		for(int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp1 = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp1;
		return i+1;
	}

	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi+1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 22, 4, 33, 55, 98 };
		quickSort(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
