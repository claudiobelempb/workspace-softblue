package estruturasRepeticao.examples;

public class ExEvenSum {
	public static void main(String[] args) {
		int forSum = 0;
		for (int i = 0; i <= 100; i++) {
			forSum += i % 2 == 0 ?  i : 0;
		}
		
		System.out.println("For " + forSum);
	}
}
