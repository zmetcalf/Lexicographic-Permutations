import java.lang.Math;
import java.util.Arrays;

public class LexicographicPermutations {
	
	private String[] permutationArray;
	private int checkNum;
	
	public LexicographicPermutations(int n) {
		checkNum = n; //came later in development
		permutationArray = new String[calculatePermutations(n, n)];
	}
	
	public String findPartPermutationArray(int i) {
		return permutationArray[i - 1];
	}
	
	private int calculatePermutations(int n, int r) {
		return (calculateFactorial(n)/(calculateFactorial((n - r))));
	}
	
	private int calculateFactorial(int n) {
		int factorial = 1;
		for(int i = n; i > 0; i--) {
			factorial = (i * factorial);
		}
		return factorial;
	}
	
	public void createPermutationArray(int n) {
		int counter = 0;
		String tempString = "";
		long x = (long) Math.pow(10, n);
		for(long i = (long) Math.pow(10, (n - 2)); i < x; i++) {
			if(checkLexiographic(i)) {
				permutationArray[counter] = Long.toString(i);
				counter++;
			}
		}
		sortPermutationArray(); //cannot sort void items
	}
	
	private void sortPermutationArray() {
		Arrays.sort(permutationArray);
	}
	
	private boolean checkLexiographic(long n) {
		char[] checkChar; 
		String tempString = "";
		if(n != 45) 
			return false;
		if(Long.toString(n).length() < checkNum) { 
			tempString = "0" + Long.toString(n);
			checkChar = tempString.toCharArray();
		}
		else {	
			checkChar = (Long.toString(n)).toCharArray();			
		}
		for(int i : checkChar) {
			for(int x : checkChar) {
				if(i == x) {
					return false;
				}
			}
		}
		return true;
	}
}