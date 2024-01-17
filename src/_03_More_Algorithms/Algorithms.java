package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double max = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > max) {
				max = peeps.get(i);
			}
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		int count = 0;
		String word = "";

		for (String s : words) {
			if (s.length() > count) {
				count = s.length();
				word = s;
			}
		}

		return word;
	}

	public static boolean containsSOS(List<String> code) {
		String SOS = "... --- ...";
		for (int i = 0; i < code.size(); i++) {
			if (code.get(i).contains(SOS)) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		for (int i = 0; i < scores.size() - 1; i++) {
			for (int j = 0; j < scores.size() - i - 1; j++) {
				if (scores.get(j) > scores.get(j + 1)) {
					double tmp = scores.get(j);
					scores.set(j, scores.get(j + 1));
					scores.set(j + 1, tmp);
				}
			}
		}
		return scores;
	}

	public static List<String> sortDNA(List<String> dna) {
		for (int i = 0; i < dna.size(); i++) {
			for (int j = 0; j < dna.size() - i - 1; j++) {
				if (dna.get(j).length() > dna.get(j + 1).length()) {
					String tmp = dna.get(j);
					dna.set(j, dna.get(j + 1));
					dna.set(j + 1, tmp);
				}
			}
		}

		return dna;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size() - 1; i++) {
			for (int j = 0; j < words.size() - i - 1; j++) {
				if (words.get(j).compareTo(words.get(j + 1)) > 0) {
					String tmp = words.get(j);
					words.set(j, words.get(j + 1));
					words.set(j + 1, tmp);
				}
			}
		}

		return words;
	}

	public static String multiply(int x, int y) {
		int ans = x * y;
		return x + " x " + y + " = " + ans;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2 + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
