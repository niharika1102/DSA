import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class WordBreak {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		ArrayList<String> res = new ArrayList<>();

		solve(s, dictionary, res, "");
		return res;
	}

	public static void solve(String s, ArrayList<String> dictionary, ArrayList<String> res, String a) {
		if (s.length() == 0) {
			res.add(a.trim());
		}

		for (int i = 0; i < s.length(); i++) {
			String left = s.substring(0, i + 1);
			if (dictionary.contains(left)) {
				String rem = s.substring(i + 1);
				solve(rem, dictionary, res, a + left + " ");
			}
		}

		return;
	}
}
