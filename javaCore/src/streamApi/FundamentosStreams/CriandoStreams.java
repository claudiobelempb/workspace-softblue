package streamApi.FundamentosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("A", "B", "C");
		s1.forEach(e -> System.out.println(e));

		String[] array = { "A", "B", "C" };
		Stream<String> s2 = Arrays.stream(array);
		s2.forEach(e -> System.out.println(e));

		List<String> list = List.of("A", "B", "C");
		Stream<String> s3 = list.stream();
		s3.forEach(e -> System.out.println("=> " + e));
	}
}
