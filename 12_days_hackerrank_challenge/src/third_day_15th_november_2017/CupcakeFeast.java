package third_day_15th_november_2017;

public class CupcakeFeast {
	public static void main(String[] args) {
		String[] trips = new String[3];
		trips[0] = "10 2 5";
		trips[1] = "12 4 4";
		trips[2] = "6 2 2";
		maximumCupcakes(trips);
		// int [] tokensInteger = new int[tokens.length];
//		int n, c, m;
//		n = Integer.parseInt(tokens[0]);
//		c = Integer.parseInt(tokens[1]);
//		m = Integer.parseInt(tokens[2]);

		/*
		 * for(int i = 0; i < tokensInteger.length; i++) { tokensInteger[i] =
		 * Integer.parseInt(tokens[i]); }
		 */
		
	}

	static void maximumCupcakes(String[] trips) {
		for (int i = 0; i < trips.length; i++) {
			String input = trips[i];
			String[] tokens = input.split(" ");
			// int [] tokensInteger = new int[tokens.length];
			int n, c, m;
			
			n = Integer.parseInt(tokens[0]);
			c = Integer.parseInt(tokens[1]);
			m = Integer.parseInt(tokens[2]);
			
			System.out.println(i + " here is m " + n);
			System.out.println(i + " here is c " + c);
			System.out.println(i + " here is m " + m);
			
			int curr_num_wrappers = 0;
			int total_num_cakes_count = 0;
			total_num_cakes_count = n/c;
			curr_num_wrappers = total_num_cakes_count;
//			int remainder = 0;
			while(curr_num_wrappers >= m) {
				int mod = curr_num_wrappers % m;
				curr_num_wrappers = curr_num_wrappers/m;
				total_num_cakes_count += curr_num_wrappers;
				curr_num_wrappers += mod;
				
			}
			System.out.println(total_num_cakes_count);
		}
	}

}
