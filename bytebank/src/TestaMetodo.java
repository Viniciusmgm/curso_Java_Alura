
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoVini = new Conta();
		contaDoVini.saldo = 200;
		contaDoVini.deposita(250);
		
		System.out.println(contaDoVini.saldo);
		
		boolean deuCerto = contaDoVini.saca(200);
		System.out.println(contaDoVini.saldo);
		System.out.println(deuCerto);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.saldo = 200;
		
		if(contaDaMarcela.transfere(50, contaDoVini)) {
			System.out.println("Transferência feita com sucesso");
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
		System.out.println("Saldo da Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo d0 Vini: " + contaDoVini.saldo);
	}
}
