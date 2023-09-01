package streamApi.FundamentosStreams;

import java.util.Arrays;
import java.util.Random;

public class streamRandomicos {

	public static void main(String[] args) {
		Random random = new Random();

		int[] array = random.ints(10,0,10000).toArray();

		System.out.println(Arrays.toString(array));

	}

}
