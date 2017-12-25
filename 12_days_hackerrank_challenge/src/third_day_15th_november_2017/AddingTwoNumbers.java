package third_day_15th_november_2017;

public class AddingTwoNumbers {
	
	 static int addNumbers(float a, float b) {
		 	return ((int) (a+b));
	    }

	
	public static void main(String[] args) {
		float a = 1.9f;
		float b = 2.3f;
		int res = addNumbers(a, b);
		System.out.println(res);
	}
}
