package second_day_14th_november_2017;

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
//		int[] num = new int[a.length*a.length];
		List<Integer> num = new ArrayList<>();
		boolean flag = false;
		/*int count = 0;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] < a[i+1]) {
				count++;
			}
		}
		
		if(count == a.length) {
			return -1;
		}*/
		
		for (int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(i < j && a[i] < a[j]) {
//					num[index++] = a[j] - a[i];
					num.add(a[j] - a[i]);
					flag = true;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < num.size(); i++) {
			if(max < num.get(i)) {
				max = num.get(i);
			}
		}
		if(flag) {
			return max;
		} 	
		return -1;
	}

}
