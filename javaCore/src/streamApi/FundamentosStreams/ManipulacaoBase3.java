package streamApi.FundamentosStreams;

import java.util.List;

public class ManipulacaoBase3 {

	public static void main(String[] args) {

		List<Person> person = List.of(new Person("Pedro", 15), new Person("Manoel", 21), new Person("Joana", 30),
				new Person("Rita", 29), new Person("Ricardo", 45));

		int max = person.stream().mapToInt(p -> p.age()).max().orElse(0);
		System.out.println(max);

		int min = person.stream().mapToInt(p -> p.age()).min().orElse(0);
		System.out.println(min);

		double avg = person.stream().mapToInt(p -> p.age()).average().orElse(0);
		System.out.println(avg);
	}

	record Person(String name, int age) {
	}

}
