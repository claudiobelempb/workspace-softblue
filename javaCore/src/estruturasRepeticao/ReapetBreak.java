package estruturasRepeticao;

public class ReapetBreak {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 200) {
			if(i == 100 + 1) break;
			System.out.println(i);
			i++;
		}

	}

}
