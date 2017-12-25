package november_21st_2017;

public class PsychometricTesting {

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int res[] = new int[lowerLimits.length];
		int count = 0;
		int j = 0, k = 0;
		int index = 0;
		while (j < upperLimits.length /* && k < lowerLimits.length */) {
			// if(upperLimits.length <)
			count = 0;
			for (int i = 0; i < scores.length; i++) {
				if (scores[i] >= lowerLimits[j] && scores[i] <= upperLimits[j]) {
					count++;
				}
			}
			res[index++] = count;
			j++;
		}
		return res;

	}

	public static void main(String[] args) {
		int scores[] = { 4, 8, 7 };
		int lowerLimits[] = { 2, 4 };
		int upperLimits[] = { 8, 4 };
		int res[] = jobOffers(scores, lowerLimits, upperLimits);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
