import java.util.*;


public class Permutations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Character> chars = new HashSet();
		char[] charArray = s.next().toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			chars.add(charArray[i]);
		}
		permutate(chars, new char[chars.size()], 0);
	}

	private static void permutate(Set<Character> availableLetters, char[] currentWord, int curPos) {
		if(curPos == currentWord.length) {
			System.out.println(Arrays.toString(currentWord));
			return;
		}
		Set<Character> l = new HashSet(availableLetters);
		for(Character c: availableLetters) {
			currentWord[curPos] = c;
			l.remove(c);
			permutate(l, currentWord, curPos + 1);
			l.add(c);
		}
	}
}

