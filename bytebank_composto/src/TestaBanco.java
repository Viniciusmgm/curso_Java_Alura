
public class TestaBanco {

	public static void main(String[] args) {
		/*
		Cliente vini = new Cliente();
		vini.nome = "Vinicius Miranda";
		vini.cpf = "12.456.789-00";
		vini.profissao = "Estagiário de TI";
		*/
		
		Conta contaDoVini = new Conta();
		contaDoVini.titular = new Cliente();
		contaDoVini.deposita(100);
		//contaDoVini.titular = vini;
	}
}
