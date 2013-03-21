public class LexicographicPermutationsTest {

	public static void main(String [] args) {
		LexicographicPermutations lexi = new LexicographicPermutations(3);
		lexi.createPermutationArray(3);
		for(int i = 1; i < 6; i++)		
			System.out.println(lexi.findPartPermutationArray(i));
	}
}
