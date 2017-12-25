package second_day_14th_november_2017;

import java.util.Scanner;

public class JumpingJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int output = maxStep(n, k);
		System.out.println(output);
		sc.close();
	}
	
	public static int maxStep(int n, int k) {
		int[] arr = new int[n+1];
		int index = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 1; j <= n; j++) {
				if(j == i) {
					continue;
				}
				sum += j;
				if(sum == k) {
					sum -= j;
				}
			}
				arr[index++] = sum;
		}
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
