package second_day_14th_november_2017;

import java.util.Scanner;

public class FourthBit {
	public static void main(String[] args) {
		int val = fourthBit(77);
		System.out.println(val);
	}
	static int fourthBit(int num) {
        String binNum = new String("");
        while(num != 0) {
        	binNum += num % 2;
        	num /= 2;
        }
//        System.out.println("inside fourth bit = "+ binNum.charAt(3));
//        int valResult = Integer.parseInt(binNum, binNum.charAt(3));
        return Character.getNumericValue(binNum.charAt(3));
        
    }
}
