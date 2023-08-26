package estruturasRepeticao.examples;

import java.util.Scanner;

public class ExAverangeWithInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 1;
		double sum = 0;
		
		while(true) {
			System.out.print("Digite a nota " + n + ": ");
			String line = scanner.nextLine();
			
			if(line.isBlank()) {
				n--;
				break;
			}
			sum += Double.parseDouble(line);
			System.out.println(sum);
			n++;
		}
		
		double avg = sum / n;
		
		System.out.println(n + " notas(s) fornecidas(s)");
		System.out.println("A média é: " + avg);
		
		scanner.close();
	}
}