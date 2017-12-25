package first_day_13th_november_2017;

import java.util.Scanner;

public class MergeSort {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String stra = sc.next();
	String strb = sc.next();
//	mergeString(stra, strb);
	System.out.println(mergeString(stra, strb));
	sc.close();
}
   public static String mergeString(String a, String b) {
//	   String[] finString = new String[a.length()+b.length()];
	   StringBuilder finString = new StringBuilder("");
	   if(a.length() > b.length()) {
		   for(int i = 0; i < b.length(); i++) {
			   finString.append(a.charAt(i));
			   finString.append(b.charAt(i));
		   }
		   
		   finString.append(a.subSequence(b.length(), a.length()));
//		   System.out.println(finString);
	   }
	   
	   else {
		   for(int i = 0; i < a.length(); i++) {
			   finString.append(a.charAt(i));
			   finString.append(b.charAt(i));
		   }
		   finString.append(b.subSequence(a.length(), b.length()));
	   }
	   return finString.toString();
//	   System.out.println(finString);
   }
}
