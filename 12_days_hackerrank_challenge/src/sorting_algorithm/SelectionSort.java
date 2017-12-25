package sorting_algorithm;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
//			int temp  = arr[i];
			int imin = i;
			for(int  j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[imin])
						imin = j;
			}
			int temp = arr[imin];
			arr[imin] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 33, 2, 55, 6, 99};
		selectionSort(arr);
	}
}
