package extra_feature;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder strTest = new StringBuilder("");
		strTest.append("a");
		strTest.append("b");
		strTest.append("c");
		strTest.append("ab");
		strTest.append("abc");
		
		System.out.println(strTest.toString());
	}
}
