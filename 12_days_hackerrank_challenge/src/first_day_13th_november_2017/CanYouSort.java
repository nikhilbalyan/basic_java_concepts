
package first_day_13th_november_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class CanYouSort {
    /*
     * Complete the function below.
     */
    static void customSort(int[] arr) {
    	if (arr == null || arr.length == 0) {
    		return;
    	}
    	int count = 0;
    	quickSort(arr, 0, arr.length-1);
    	for(int i = 0; i < arr.length; i++) {
    		count = 0;
    		for(int j = i; j < arr.length; j++) {
    			if(arr[i] == arr[j]) {
    				count++;
    			}
    		}
    		if(count == 1) {
    			System.out.println(arr[i]);
    		}
    	}
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length; j++) {
    			
    		}
    	}
    }
    
    public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}


	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }
        customSort(arr);
    }
}