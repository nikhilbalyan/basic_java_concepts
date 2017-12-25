package second_day_14th_november_2017;

import java.util.Scanner;

public class k_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = kDifference(arr, k);
		sc.close();
		System.out.println(res);
	}
	
	  static int kDifference(int[] a, int k) {
		  int sum = 0;
			int count = 0;
			for(int i = 0; i < a.length; i++) {
				for(int j = i+1; j < a.length; j++) {
					if(Math.abs(a[i]- a[j]) == k) {
						count++;
					}
				}
			}
			return count;
	    }

}
