
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(129, 198);
		//conta.numero = 1338;
		//conta.setNumero(1339);
		System.out.println(conta.getNumero());
		
		Cliente vini = new Cliente();
		//conta.titular = vini;
		
		conta.setTitular(vini);
		conta.getTitular().setNome("Vinicius");
	}
}
