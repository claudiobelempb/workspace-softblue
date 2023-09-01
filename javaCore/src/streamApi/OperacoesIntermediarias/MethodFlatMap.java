package streamApi.OperacoesIntermediarias;

public class MethodFlatMap {
	public static void main(String[] args) {
		var grades = Student.list().stream().map(s -> s.grades()).flatMap(l -> l.stream()).toList();

		System.out.println(grades);
	}
}
