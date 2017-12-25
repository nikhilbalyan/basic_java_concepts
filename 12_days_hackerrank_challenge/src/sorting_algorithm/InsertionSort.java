package sorting_algorithm;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		int j, key;
		for(int i = 1; i < arr.length; i++) {
			j = i-1;
			key = arr[i];
			while( j >= 0 && arr[j] > arr[j+1]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int arr [] = { 1, 33, 4, 5, 89};
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
