package november_20th_2017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperStack {

	/*
	 * Complete the function below.
	 */
	static void superStack(String[] operations) {
		List<Integer> superStack = new ArrayList<Integer>();
//		int superStack[] = new int[operations.length];
		String tempString = "";
		int index = -1;
		int k = 0;
		for (int i = 0; i < operations.length; i++) {
			tempString = operations[i];			
			k = 0;
			String[] split = tempString.split(" ");
			if (split[0].equals("push")) {
				index++;
				superStack.add(index,Integer.parseInt(split[1]));
//				superStack[index] = Integer.parseInt(split[1]);
				System.out.println(superStack.get(superStack.size()-1));
//				System.out.println(superStack[superStack.length-1]);
			}
			if (split[0].equals("pop")) {
				if (index != -1) {
					index--;
					superStack.remove(superStack.size()-1);
					
				} 
				if(index == -1) {
					System.out.println("EMPTY");
				} else {
					System.out.println(superStack.get(superStack.size()-1));
//					System.out.println(superStack[superStack.length-1]);
				}
			}
			if (split[0].equals("inc")) {
				while (k < Integer.parseInt(split[1])) {
					superStack.set(k, superStack.get(k) + Integer.parseInt(split[2]));
//					superStack[k] = superStack[k] + Integer.parseInt(split[2]);
					k++;
				}
				System.out.println(superStack.get(superStack.size()-1));
//				System.out.println(superStack[superStack.length-1]);
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "push 4", "pop", "push 3", "push 5", "push 2",
				"inc 3 1", "pop", "push 1", "inc 2 2", "push 4", "pop", "pop" };
		superStack(str);
	}
}
