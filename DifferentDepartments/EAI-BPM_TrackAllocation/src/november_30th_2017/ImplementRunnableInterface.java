package november_30th_2017;

import java.util.Scanner;

class ImplementRunnable implements Runnable {
	int number;

	ImplementRunnable(int no) {
		number = no;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			checkNumberPallindrome(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkNumberPallindrome(int number) {
		int temp = number;
		int reverse = 0;
		int singleDigit = 0;
		while (number != 0) {
			reverse = reverse*10;
			singleDigit = number % 10;
			reverse += singleDigit;
			number = number/10;
		}
		if(reverse == temp) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}
	}

}

public class ImplementRunnableInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ImplementRunnable i1 = new ImplementRunnable(num);
		Thread t1 = new Thread(i1);
		t1.start();
		sc.close();
	}
}
