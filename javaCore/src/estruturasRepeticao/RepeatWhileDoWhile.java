package estruturasRepeticao;

public class RepeatWhileDoWhile {

	public static void main(String[] args) {

		int n = 1;

		System.out.println("WHILE");
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
		System.out.println("FIM");

		System.out.println("DO-WHILE");

		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);

	}

}
