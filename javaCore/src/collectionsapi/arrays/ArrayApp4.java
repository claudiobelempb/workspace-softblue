package collectionsapi.arrays;

public class ArrayApp4 {

	public static void main(String[] args) {
		int[] primeNumes = { 2, 3, 5, 7, 11, 13, 17, 19 };
		for(int i = 0; i < primeNumes.length; i++) {
			System.out.format("=> %s\n", primeNumes[i]);
		}
		
		for(int p : primeNumes) {
			System.out.format("=> %s\n", p);
		}
	}

}
