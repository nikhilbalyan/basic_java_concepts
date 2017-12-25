package first_day_13th_november_2017;

import java.util.Scanner;

public class JumpingJack {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int output = maxStep(n, k);
		System.out.println(output);
		sc.close();
	}
	public static int maxStep(int n, int k) {
		int /*temp = 0,*/ cur = 0;
		for(int i = 0; i < n; i++) {
			cur += i;
			if(cur == k) {
				cur -=i;
			}
			
		}
		return cur;
	}
}
