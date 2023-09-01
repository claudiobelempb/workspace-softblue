package collectionsapi.arrays;

public class ArrayVarargs {

	public static void main(String[] args) {
		int[] n = { 5, 6, 3, 10 };
		int sum1 = sum(n);
		System.out.println(sum1);

		int sum2 = sum2(2, 3);
		System.out.println(sum2);

	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

	private static int sum2(int... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

}
