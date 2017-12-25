package second_day_14th_november_2017;

import java.util.Scanner;

public class BinaryNumber {
  private static int binaryNum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		if (number < 0) {
		} else {
			printBinaryForm(number);
		}
		in.close();
	}
	
	public static void printBinaryForm(int number) {
		int i = 0, binArray[] = new int[7];
		int binary[];
		while(number > 0) {
			binArray[i++] = number % 2;
			number /= 2;
		}
		binary = new int[i];
		int k = 0;
		for(int j = i-1; j >= 0; j--) {
			binary[k++] = binArray[j];
		}
		int[] invert = getInvert(binary);
		String nu = "";
		for(int d = 0; d < invert.length; d++) {
			nu += invert[d];
		}
		int finDecimal = Integer.parseInt(nu, 2);
		System.out.println(finDecimal);
	}
	
	public static int[] getInvert(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				num[i] = 1;
			} else {
				num[i] = 0;
			}
		}
		return num;
	}

}
