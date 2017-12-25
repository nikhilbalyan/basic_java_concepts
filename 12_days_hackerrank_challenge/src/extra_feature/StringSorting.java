package extra_feature;

public class StringSorting {

	public static void sort(String[] str) {
		boolean done = false;
		while (done == false) {
			done = true;
			for (int i = 0; i < str.length - 1; i++) {
				int num = 0;
				if (str[i] != null && str[i + 1] != null) {
					String name1 = str[i];
					String name2 = str[i + 1];
					num = name1.compareTo(name2);
				} else if (str[i] == null && str[i + 1] == null) {
					num = 0;
				} else if (str[i] == null) {
					num = 1;
				} else {
					num = -1;
				}
				if (num > 0) {
					String temp = str[i];
					str[i] = str[i + 1];
					str[i + 1] = temp;
					done = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "Sam", "Alex", "Michael", "Bool", "Alex" };
		sort(str);
		String tempStr = str[0];
		int count;
		for(int i = 1; i < str.length; i++) {
			if(str.equals(tempStr)) {
				count++;
			}
		}
	}
}
