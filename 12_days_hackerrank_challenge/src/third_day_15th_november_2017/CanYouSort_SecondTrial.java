package third_day_15th_november_2017;

import java.util.Collections;

public class CanYouSort_SecondTrial {
	
	class ElementStructure {
		int count, index, val;
		
		/*@Override
		 public int compareTo(ElementStructure arg0) {

		        if (this.count > arg0.count)
		            return 0;
		        else
		            return 1;
		    }
*/	}
	
	//used for sorting the value
	boolean sortValue(ElementStructure first, ElementStructure second) {
		return (first.val < second.val);
	}
	
	// used for sorting by frequency And if frequency is same,
	// then by appearance
	boolean sortFrequency(ElementStructure first, ElementStructure second) {
		if(first.count != second.count) {
			return (first.count < second.count);
		}
		else {
			return first.index > second.index;
		}
	}
	
	static void customSort(int[] arr) {
		ElementStructure element[] = new ElementStructure[arr.length];
		for(int i = 0; i < arr.length; i++) {
			element[i].index = i;	// fill indexes
			element[i].count = 0;	// initialize counts as 0
			element[i].val = arr[i]; // fill values in structure elements
		}
		// sort the structure elements according to value,
		// we used
		quickSort(arr, 0, arr.length);
		
		// initializing count of first element as 1
//		Collections.sort(Element);
		
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
	
	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}



	public static void main(String[] args) {
		int a[] = {3, 1, 2, 3, 4};
		System.out.println("sorted array is = ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
