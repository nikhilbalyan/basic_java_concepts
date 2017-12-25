package second_day_14th_november_2017;

import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = countHoles(num);
		System.out.println(sum);
		sc.close();
	}

	static int countHoles(int num) {
		int singleNum;
		int sum = 0;
		while(num != 0) {
			singleNum = num % 10;
			num = num / 10;
//			System.out.println("singleNum = "+singleNum);
				
				if(singleNum == 8) {
					sum += 2;
				}
				else if(singleNum == 0 || singleNum == 4 || singleNum == 6 || singleNum == 9) {
					sum += 1;
				}
			
		}
		return sum;
	}
}
