package search;

public class binarySearch {

	public static void merge(int[] arr, int low, int med, int high) {
		// left sub array
		int n1 = med - low + 1;
		
		// right sub array
		int n2 = high - med;

		int left[] = new int[n1];
		int right[] = new int[n2];
		
		/*for(int i = 0; i < med; i++) {
			left[i] = arr[i];
		}*/
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[low+i];
		}
		
		for(int j = 0; j < n2; j++) {
			right[j] = arr[med+j+1];
		}
		
		int i = 0, j = 0, k = low;		
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k++] = left[i++]; 
		}
		
		while(j < n2) {
			arr[k++] = right[j++];
		}
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public static int binarySearch(int arr[], int low, int high, int x) {
		if(low <= high) {
			int mid = (low) + (high-low)/2;
			
			if(arr[mid] == x) {
				return arr[mid];
			}
			
			if(x < arr[mid]) 
				return binarySearch(arr, low, mid-1, x);
			return binarySearch(arr, mid+1, high, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 23, 45, 43, 22, 20, 19 };
		mergeSort(arr, 0, arr.length - 1);
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		int key = 43;
		int num = binarySearch(arr, 0, arr.length, key);
		System.out.println(num);
	}
}
