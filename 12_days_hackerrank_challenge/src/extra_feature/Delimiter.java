package extra_feature;

public class Delimiter {
	public static void main(String[] args) {
		String input = "this is a test";
		String[] tokens = input.split(" ");
		// int [] tokensInteger = new int[tokens.length];
		int n, c, m;
		n = Integer.parseInt(tokens[0]);
		c = Integer.parseInt(tokens[1]);
		m = Integer.parseInt(tokens[2]);

		/*
		 * for(int i = 0; i < tokensInteger.length; i++) { tokensInteger[i] =
		 * Integer.parseInt(tokens[i]); }
		 */
		for (String tok : tokens) {
			System.out.println(tok);
		}
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
			
			int curr_num_wrappers = 0;
			int total_num_cakes_count = 0;
			total_num_cakes_count = n/c;
			curr_num_wrappers = total_num_cakes_count;
			int remainder = 0;
			while(curr_num_wrappers > m) {
				remainder = curr_num_wrappers/m;
				curr_num_wrappers += remainder;
				total_num_cakes_count = remainder;
			}
			System.out.println(total_num_cakes_count);
		}
	}

}
