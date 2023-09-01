package streamApi.FundamentosStreams;

import java.util.List;

public class ManipulacaoBase1 {

	public static void main(String[] args) {
		List<Person> person = List.of(new Person("Pedro", 15), new Person("Manoel", 21), new Person("Joana", 30),
				new Person("Rita", 29), new Person("Ricardo", 45));

		person.stream().map(p -> p.name()).map(p -> p.toUpperCase()).sorted().forEach(p -> System.out.println(p));
	}

	record Person(String name, int age) {
	}

}
