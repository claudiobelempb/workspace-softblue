package collectionsapi.arrays;

import java.util.Arrays;

public class ArrayApp2 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		System.out.println(Arrays.toString(array1));

		boolean[] array2 = new boolean[5];
		System.out.println(Arrays.toString(array2));

		double[] array3 = new double[5];
		System.out.println(Arrays.toString(array3));

		String[] array4 = new String[5];
		System.out.println(Arrays.toString(array4));

		int[] array5 = new int[] { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(array5));
		
		int[] array6 =  { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(array6));
	}

}
