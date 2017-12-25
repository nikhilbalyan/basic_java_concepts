package november_20th_2017;

public class SimpleQueries {
	
	  static int[] counts(int[] nums, int[] maxes) {
		  int answers[] = new int[maxes.length];
		  int count;
		  for(int i = 0; i < maxes.length; i++) {
			  count = 0;
			  for(int j = 0;  j < nums.length; j++) {
				  if(maxes[i] >= nums[j]) {
					  count++;
				  }
			  }
			  answers[i] = count;
		  }
		  return answers;
	    }

	
	public static void main(String[] args) {
		int nums[] = {1, 4, 2, 4};
		int maxes[] = {3, 5};
		int[] ansers = counts(nums, maxes);
		for(int i: ansers) {
			System.out.println(i);
		}
	}
}
