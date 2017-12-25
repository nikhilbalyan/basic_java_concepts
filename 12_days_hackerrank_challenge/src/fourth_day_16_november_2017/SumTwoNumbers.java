package fourth_day_16_november_2017;

public class SumTwoNumbers {
	
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
	
	
	

	
	static int numberOfPairs(int[] a, long k) {
		quickSort(a, 0, a.length-1);
		
		long sum = 0;
		int countL = 0;
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				sum = a[i] + a[j];
				if(sum == k && a[i] == a[j]) {
					countL++;
				}
			}
		}
		
		
		
		int index = 0;
		boolean flag = false;
		int uniqueElem[] = new int[a.length];
		// this for loop is is counting the no of occurance
		for (int i = 0; i < a.length; i++) {
			flag = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					i++;
				} else {
					flag = true;
					uniqueElem[index] = a[i];
					index++;
					break;
				}
			}
			if (!flag) {
				uniqueElem[index] = a[i];
				index++;
			}
		}
		
		
//		countL = 0;
		for(int i = 0; i < index-1; i++) {
			for(int j = i+1; j < index; j++) {
				sum = uniqueElem[i] + uniqueElem[j];
				if(sum == k && uniqueElem[i] != uniqueElem[j]) {
					countL++;
				}
			}
		}
		
		return countL;
    }
	
	public static void main(String[] args) {
		int a[] = { 6, 6, 3, 9, 3, 5, 1};
		int k = 12;
		int kcm = numberOfPairs(a, k);
		System.out.println(kcm);
	}
}
