package third_day_15th_november_2017;

public class Pangrams {

	static String isPangram(String[] strings) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < strings.length; i++) {
			System.out.println("string length is = " + strings.length);
			int[] isPangEle = new int[26];
			String isPang = strings[i];
			for (int j = 0; j < isPang.length(); j++) {
				System.out.println("pang length is = "+ isPang.length());
				switch (isPang.charAt(j)) {
				case 'a':
					isPangEle[0] = 1;
					break;
				case 'b':
					isPangEle[1] = 1;
					break;
				case 'c':
					isPangEle[2] = 1;
					break;
				case 'd':
					isPangEle[3] = 1;
					break;
				case 'e':
					isPangEle[4] = 1;
					break;
				case 'f':
					isPangEle[5] = 1;
					break;
				case 'g':
					isPangEle[6] = 1;
					break;
				case 'h':
					isPangEle[7] = 1;
					break;
				case 'i':
					isPangEle[8] = 1;
					break;
				case 'j':
					isPangEle[9] = 1;
					break;
				case 'k':
					isPangEle[10] = 1;
					break;
				case 'l':
					isPangEle[11] = 1;
					break;
				case 'm':
					isPangEle[12] = 1;
					break;
				case 'n':
					isPangEle[13] = 1;
					break;
				case 'o':
					isPangEle[14] = 1;
					break;
				case 'p':
					isPangEle[15] = 1;
					break;
				case 'q':
					isPangEle[16] = 1;
					break;
				case 'r':
					isPangEle[17] = 1;
					break;
				case 's':
					isPangEle[18] = 1;
					break;
				case 't':
					isPangEle[19] = 1;
					break;
				case 'u':
					isPangEle[20] = 1;
					break;
				case 'v':
					isPangEle[21] = 1;
					break;
				case 'w':
					isPangEle[22] = 1;
					break;
				case 'x':
					isPangEle[23] = 1;
					break;
				case 'y':
					isPangEle[24] = 1;
					break;
				case 'z':
					isPangEle[25] = 1;
					break;
				}
			}
			boolean flag = true;
			for(int j = 0; j < isPangEle.length; j++) {
				if(isPangEle[j] == 0) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("append 1");
				result.append(1);
			} else {
				System.out.println("append 0");
				result.append(0);
			}
			
		}
		return result.toString();
	}

	public static void main(String[] args) {
		int[] max = new int[25];
		String[] pang = new String[4];
		pang[0] = "we promptly judged antique ivory buckles for the next prize";
		pang[1] = "we promptly judged antique ivory buckles for the prizes";
		pang[2] = "the quick brown fox jumps over the lazy dog";
		pang[3] = "the quick brown fox jump over the lazy dog";
		String result = isPangram(pang);
		System.out.println(result);
	}
}
