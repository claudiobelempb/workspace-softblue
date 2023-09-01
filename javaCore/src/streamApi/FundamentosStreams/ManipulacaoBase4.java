package streamApi.FundamentosStreams;

import java.util.List;

public class ManipulacaoBase4 {
	public static void main(String[] args) {

		List<Person> person = List.of(new Person("Pedro", 15), new Person("Manoel", 21), new Person("Joana", 30),
				new Person("Rita", 29), new Person("Ricardo", 45));

		List<String> name = person.stream().map(p -> p.name()).map(n -> n.toUpperCase()).filter(n -> !n.startsWith("R")).toList();
		System.out.println(name);
	}

	record Person(String name, int age) {
	}
}
