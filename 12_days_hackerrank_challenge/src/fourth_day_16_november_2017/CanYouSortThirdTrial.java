package fourth_day_16_november_2017;

public class CanYouSortThirdTrial {

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

	static int partitionDoubleArr(int arr[][], int low, int high) {
		int pivot = arr[high][1];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j][1] <= pivot) {
				i++;
				int temp = arr[i][1];
				arr[i][1] = arr[j][1];
				arr[j][1] = temp;

							int temp1 = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp1;
			}
		}

		int temp = arr[i + 1][1];
		arr[i + 1][1] = arr[high][1];
		arr[high][1] = temp;

		// if (arr[i][0] < arr[i + 1][0]) {
//		if (arr[i + 1][1] != arr[i][1]) {
			int temp1 = arr[i + 1][0];
			arr[i + 1][0] = arr[high][0];
			arr[high][0] = temp1;
			// }
//		} else {
			
//		}
		return i + 1;
	}

	static void quickSortDoubleArr(int arr[][], int low, int high) {
		if (low < high) {
			int pi = partitionDoubleArr(arr, low, high);
			quickSortDoubleArr(arr, low, pi - 1);
			quickSortDoubleArr(arr, pi + 1, high);
		}
	}

	static void customSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		int max = 0;
		int resArr[] = new int[arr[arr.length -1]+1];
		 
		for(int k = 0; k < arr.length; k++) {
			resArr[arr[k]]++;
			
			if((resArr[arr[k]]) > max)
				max = resArr[arr[k]];
		}
		
		for(int count  = 1; count <= max; count++) {
			for(int t = 0; t < arr.length; t++) {
				if(resArr[arr[t]] == count) {
					System.out.println(arr[t]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 98, 98, 89, 1, 9, 9, 3, 3 };
		customSort(a);
	}
}
