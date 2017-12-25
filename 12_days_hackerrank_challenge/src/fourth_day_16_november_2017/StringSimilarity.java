package fourth_day_16_november_2017;

public class StringSimilarity {
	public static void main(String[] args) {
		String[] inputs = { "ababaa", "aa" };
		int a[] = stringSimilarity(inputs);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] stringSimilarity(String[] inputs) {
		int arrRes[] = new int[inputs.length];

		String singleInputString;
		
		String temp;
		int count;
		int sum;
		int index = 0;
		
		for (int i = 0; i < inputs.length; i++) {
			singleInputString = inputs[i];
			count = 0;
			sum = singleInputString.length(); 
			for (int j = 1; j < singleInputString.length(); j++) {
				count = 0;
				temp = singleInputString.substring(j, singleInputString.length());
				
				for(int k = 0; k < temp.length(); k++) {
					if(temp.charAt(k) == singleInputString.charAt(k)) {
						count++;
					} else {
						break;
					}
				}
				sum += count;
			}
			arrRes[index++] = sum;
		}

		return arrRes;
	}

}
