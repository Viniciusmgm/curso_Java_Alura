package sintaxe_variaveis_e_fluxo;

public class Fatorial {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			int total = 1;
			for(int j = 1; j <= i; j++) {
				total *= j;
			}
			System.out.println("O fatorial de " + i + " �: " + total);
		}
	}
}
