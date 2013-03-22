public class LexicographicPermutationsTest {

	public static void main(String [] args) {
		LexicographicPermutations lexi = new LexicographicPermutations(10);
		lexi.createPermutationArray(10);
	
		System.out.println(lexi.findPartPermutationArray(1000000));
	}
}
