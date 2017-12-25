package sorting_algorithm;

public class BubbleSort {
	
	public static void bubbleSor(int[] arr) {
		int temp;
		boolean flag;
		for(int i = 0; i < arr.length-1; i++) {
			flag = false;
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!flag) {
				break;
			}
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	  public static void main(String[] args) {
		int a[] = { 33, 2, 1, 44, 4};
		bubbleSor(a);
	}
}
