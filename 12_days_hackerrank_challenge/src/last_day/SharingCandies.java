package last_day;

import java.util.ArrayList;
import java.util.List;

public class SharingCandies {

	static long getCandies(long n, long p) {
//		int val = (int) n; 
		
//		long arr[] = new long[(int) n];
		List<Long> arrlist= new ArrayList<Long>();
		
		if(n < p) {
			return 0;
		}
		
		arrlist.add(1L);
		int index = 0;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				index++;
//				arr[index] = i;
				
				/*System.out.println(i + "| " + n);
				System.out.println(" -----");*/
				n = n / i;
			}
		}
		
		/*for(int i = 0; i <= index; i++) {
			System.out.println(arr[i]);
		}*/
		System.out.println();
		
		arr
//		return 1;
	}

	public static void main(String[] args) {
		long n = 99999999;
		long t = 901;
		getCandies(n, t);
	}
}
