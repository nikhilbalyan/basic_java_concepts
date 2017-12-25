package extra_feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperStackAddElements {
	public static void main(String[] args) {
		List<Integer> superStack = new ArrayList<Integer>();
		superStack.add(10);
		superStack.add(11);
		superStack.add(13);
		superStack.add(14);
		int k = 0;
		while(k < 3) {
//			superStack.add(k, superStack.get(k) + k+1);
			superStack.set(k, k+1);
			k++;
		}
		
		Iterator<Integer> wrap = superStack.iterator();
		System.out.println("hello");
		while(wrap.hasNext()) {
			System.out.println(wrap.next());
		}
		
	}
}
