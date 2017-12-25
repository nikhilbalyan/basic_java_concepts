package last_day;

import java.util.HashMap;
import java.util.Scanner;

public class ModifyPrices {

	static int verifyItems(String[] origItems, float[] origPrices,
			String[] items, float[] prices) {
		HashMap<String, Float> origItemsMap = new HashMap<String, Float>();
		for (int i = 0; i < origItems.length; i++) {
			origItemsMap.put(origItems[i], origPrices[i]);
		}
		HashMap<String, Float> recordedItemsMap = new HashMap<String, Float>();
		for (int i = 0; i < items.length; i++) {
			recordedItemsMap.put(items[i], prices[i]);
		}
		int count = 0;
		for(int i = 0; i < recordedItemsMap.size(); i++) {
			if(!recordedItemsMap.get(items[i]).equals(origItemsMap.get(items[i]))) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String[] origItems = new String[n];

		for (int i = 0; i < n; i++) {
			origItems[i] = in.next();
		}

		int m = in.nextInt();
		float[] origPrices = new float[m];
		for (int i = 0; i < m; i++) {
			origPrices[i] = in.nextFloat();
		}

		int k = in.nextInt();
		String[] recordedItems = new String[k];

		for (int i = 0; i < k; i++) {
			recordedItems[i] = in.next();
		}

		int l = in.nextInt();
		float[] recordedPrices = new float[l];
		for (int i = 0; i < l; i++) {
			recordedPrices[i] = in.nextFloat();
		}
		
		
		int val = verifyItems(origItems, origPrices, recordedItems, recordedPrices);
		System.out.println(val);
		in.close();
	}
}
