package second_day_14th_november_2017;

import java.util.Scanner;

public class PowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		isPowerOf2(arr);
		sc.close();
	}

	static int[] isPowerOf2(int[] nums) {
		int size = nums.length;
		int arr[] = new int[size];
		
		outerLoop: for (int i = 0; i < size; i++) {
//			System.out.println("inside i loop");
			
			int numArr = nums[i];
			while (numArr != 1) {
//				System.out.println("inside power of 2 " + numArr);
				if (numArr % 2 != 0) {
//					System.out.println("inside if loop");
					arr[i] = 0;
					continue outerLoop;
				}
				arr[i] = 1;
				numArr = numArr / 2;
				
			}
		}

		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		return arr;
	}
}