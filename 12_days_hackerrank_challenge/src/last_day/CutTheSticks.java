package last_day;

import java.util.Scanner;

public class CutTheSticks {
	static int[] cutSticks(int[] lengths) {
		int count = 0;
		int min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < lengths.length; i++) {
			if(max < lengths[i]) {
				max = lengths[i];
			}
		}
		
		int res[] = new int[max];
		
		for (int j = 0; j < lengths.length; j++) {
			count = 0;
			for(int k = 0; k < lengths.length; k++) {
				if(min > lengths[k]) {
					min = lengths[k];
				}
			}
			
			for (int i = 0; i < lengths.length; i++) {
				if (lengths[i] > 0) {
					lengths[i] = lengths[i]-min;
					count++;
				}
			}
			
		}
		return lengths;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int res[] = cutSticks(arr);
		for (int i : res) {
			System.out.println(i);
		}
	}

}
