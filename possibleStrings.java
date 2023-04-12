
public class possibleStrings {
	
	public static void printPermutn(String str, String ans) {
		// If string is empty
		if(str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i=0; i<str.length(); i++) {
			//ith charcter of str
			char ch = str.charAt(i);
			// rest of the string after 
			// excluding the ith character
			String ros = str.substring(0, i) +
					str.substring(i+1);
			// recursivecall 
			printPermutn(ros, ans + ch);
		}
	}
	
	public static void main(String args[]) {
		String s = "abb";
		printPermutn(s, "");
	}
}
