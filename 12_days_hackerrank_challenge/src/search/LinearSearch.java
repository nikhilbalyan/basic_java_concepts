package search;

public class LinearSearch {

	public static void linearSearch(int arr[], int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("key found at index = " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 4, 5, 6, 78};
		int k = 6;
		linearSearch(arr, k);
	}
}
