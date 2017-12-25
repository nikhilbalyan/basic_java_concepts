package seventh_day;

import java.math.BigInteger;

public class ChocolatesMathFunctionFinalWorking {
	
	static void calculate(int[] arr) {
		long resArr[] = new long[arr.length];
		int index = 0;
		BigInteger sum;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
//			sum = 0;
			if(temp % 2 == 0) {
				temp = temp/2;
			} else {
				temp = temp/2 + 1;
			}
			
//			sum.add(temp*temp);
			long t1 = temp;
			t1 = t1*t1;
			resArr[index++] = t1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(resArr[i]);
		}
	}

	
	public static void main(String[] args) {
		int[] num = {99999999, 99999999};
		calculate(num);
	}
}
