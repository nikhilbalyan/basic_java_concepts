package seventh_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		int res = maxDifference(num);
		System.out.println(res);
		sc.close();
	}

	static int maxDifference(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] > a[i+1]) {
				count++;
			}
		}
		if(count == a.length-1) {
			return -1;
		}
		
		int maxDiff = a[1] - a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i] - min > maxDiff) {
					maxDiff = a[i] - min;
				} else if(a[i] < min) {
					min = a[i];
				}
			}		
		return maxDiff;
	}

}
