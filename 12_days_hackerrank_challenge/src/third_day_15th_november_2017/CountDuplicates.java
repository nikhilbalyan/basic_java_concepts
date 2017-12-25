package third_day_15th_november_2017;

import java.util.Arrays;

public class CountDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3};
		int resCount = countDuplicates(arr);
		System.out.println(resCount);
	}
	
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	static void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}

	static int countDuplicates(int[] numbers) {
		sort(numbers, 0, numbers.length-1);
		int count = 0;
		boolean flag = false;
//		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length-1; i++) {
			flag = false;
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					flag = true;
					i++;
				} else {
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		return count;
	}
}