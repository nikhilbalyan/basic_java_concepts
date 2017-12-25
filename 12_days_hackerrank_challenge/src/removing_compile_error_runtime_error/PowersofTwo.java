package removing_compile_error_runtime_error;

public class PowersofTwo {
	static int[] isPowerOf2(int[] nums) {
		int res[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int d =1, count = 0;
			int j = 0;
			while(d <= nums.length) {
				if(j!=0) {
					d = d*2;
					if(d == nums[i]) {
						res[i] = 1;
						count++;
						break;
					}
				}
				j++;
			}
			if(count == 0) {
				res[i] = 0;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 22, 33, 45, 65, 34, 21 };
		isPowerOf2(arr);
	}
}
