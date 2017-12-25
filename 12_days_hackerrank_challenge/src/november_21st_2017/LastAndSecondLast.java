package november_21st_2017;

public class LastAndSecondLast {

	static String lastLetters(String word) {
		StringBuilder strBuilder = new StringBuilder("");

			strBuilder.append(word.charAt(word.length()-1));
			strBuilder.append(" ");
			strBuilder.append(word.charAt(word.length()-2));
			
		
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String word = "Apple";
		String lastWord = lastLetters(word);
		System.out.println(lastWord);
	}
}
