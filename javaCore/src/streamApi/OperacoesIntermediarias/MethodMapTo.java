package streamApi.OperacoesIntermediarias;

import java.util.Arrays;

public class MethodMapTo {

	public static void main(String[] args) {
		int[] years = Student.list().stream().map(s -> s.yearOfBirth()).mapToInt(y -> y.getValue()).toArray();

		System.out.println(Arrays.toString(years));
	}

}
