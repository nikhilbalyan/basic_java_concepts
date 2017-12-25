package november_20th_2017;

import java.util.Arrays;
import java.util.Scanner;

public class ListMax {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		long res[] = new long[n];
		Arrays.fill(res, 0);
		while( m-- > 0) {
			int i,j,k;
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int ii = i-1; ii < j; ii++) {
				res[ii] = res[ii] + k;
			}
		}
		
		/*for(int c = 0; c < res.length; c++) {
			System.out.println(res[c]);
		}*/
		
		long max = res[0];
		for(int i = 1; i < res.length; i++) {
			if(max < res[i]) {
				max = res[i];
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
